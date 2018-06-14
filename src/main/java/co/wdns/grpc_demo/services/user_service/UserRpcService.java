package co.wdns.grpc_demo.services.user_service;

import co.wdns.grpc_demo.common.UserId;
import co.wdns.grpc_demo.repositories.UserRepository;
import co.wdns.grpc_demo.risk_engine.UserActivity;
import co.wdns.grpc_demo.services.AccessTokenService;
import co.wdns.grpc_demo.services.password_service.PasswordService;
import co.wdns.grpc_demo.user_service.*;
import com.google.common.eventbus.EventBus;
import io.grpc.stub.StreamObserver;

import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public class UserRpcService extends UserServiceGrpc.UserServiceImplBase {
    private final PasswordService passwordService;
    private final EventBus eventBus;
    private final UserRepository userRepository;
    private final AccessTokenService accessTokenService;

    public UserRpcService(EventBus eventBus, AccessTokenService accessTokenService, PasswordService passwordService) {
        this.eventBus = eventBus;
        this.userRepository = new UserRepository();
        this.accessTokenService = accessTokenService;
        this.passwordService = passwordService;
    }

    @Override
    public void registerUser(UserRegistrationRequest request, StreamObserver<UserRegistrationResult> responseObserver) {
        responseObserver.onNext(registerNewUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void loginUser(LoginUserAttempt request, StreamObserver<LoginUserResult> responseObserver) {
        responseObserver.onNext(loginExistingUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void logoutUser(LogoutUserAttempt request, StreamObserver<LogoutUserResult> responseObserver) {
        responseObserver.onNext(logoutLoggedInUser(request));
        responseObserver.onCompleted();
    }

    private UserRegistrationResult registerNewUser(UserRegistrationRequest userRegistrationRequest) {
        String username = userRegistrationRequest.getUsername().toLowerCase();
        String password = userRegistrationRequest.getPassword();
        if (this.userRepository.usernameIsRegistered(username)) {
            return UserRegistrationResult.newBuilder().setRegistrationFailure(RegistrationFailureReason.ALREADY_REGISTERED).build();
        } else if (!this.passwordService.passwordIsSecureEnough(password)) {
            return UserRegistrationResult.newBuilder().setRegistrationFailure(RegistrationFailureReason.PASSWORD_TOO_SIMPLE).build();
        } else {
            UserId userId = UserId.newBuilder().setId(UUID.randomUUID().toString()).build();
            User user = new User(userId, passwordService.hashUserPassword(username, password));
            this.userRepository.registerUser(username, user);
            AccessToken accessToken = accessTokenService.createUserAccessToken(user);
            eventBus.post(UserActivity.newBuilder().setEvent(UserActivity.Event.REGISTERED).setUserId(userId));

            return UserRegistrationResult.newBuilder()
                    .setAccessToken(accessToken)
                    .build();
        }
    }

    private LoginUserResult loginExistingUser(LoginUserAttempt loginUserAttempt) {
        String username = loginUserAttempt.getUsername().toLowerCase();
        String password = loginUserAttempt.getPassword();
        User user = this.userRepository.getUser(username);
        if (user == null) {
            return LoginUserResult.newBuilder()
                    .setLoginFailure(LoginFailureReason.USER_NOT_FOUND)
                    .build();
        } else if (!passwordService.userPasswordMatchesHash(username, password, user.getPasswordHash())) {
            return LoginUserResult.newBuilder()
                    .setLoginFailure(LoginFailureReason.BAD_PASSWORD)
                    .build();
        } else {
            AccessToken accessToken = accessTokenService.createUserAccessToken(user);
            eventBus.post(UserActivity.newBuilder().setEvent(UserActivity.Event.LOGGED_IN).setUserId(user.getUserId()));
            return LoginUserResult.newBuilder()
                    .setAccessToken(accessToken)
                    .build();
        }
    }

    private LogoutUserResult logoutLoggedInUser(LogoutUserAttempt logoutUserAttempt) {
        try {
            UserId userId = accessTokenService.userIdOfAccessTokenId(logoutUserAttempt.getAccessTokenId());
            User user = userRepository.getUser(userId);
            accessTokenService.deleteUserAccessTokens(user);
        } catch (Exception e) {
            return LogoutUserResult.newBuilder().setSuccess(false).build();
        }
        return LogoutUserResult.newBuilder().setSuccess(true).build();
    }

}
