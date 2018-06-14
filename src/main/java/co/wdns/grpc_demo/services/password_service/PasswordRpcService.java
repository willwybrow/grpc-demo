package co.wdns.grpc_demo.services.password_service;

import co.wdns.grpc_demo.password_service.*;
import io.grpc.stub.StreamObserver;

public class PasswordRpcService extends PasswordServiceGrpc.PasswordServiceImplBase {

    private final PasswordService passwordService;

    public PasswordRpcService(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @Override
    public void evaluatePasswordStrength(Password password, StreamObserver<PasswordStrength> responseObserver) {
        responseObserver.onNext(checkPasswordStrength(password));
        responseObserver.onCompleted();
    }

    @Override
    public void getPasswordSuggestions(PasswordSuggestionRequest passwordSuggestionRequest, StreamObserver<PasswordSuggestion> responseObserver) {
        for (int i = 0; i < 5; i++) {
            String suggestedPassword = passwordService.suggestPassword();
            responseObserver.onNext(PasswordSuggestion.newBuilder()
                    .setPasswordSuggestion(suggestedPassword)
                    .setPasswordStrength(passwordService.checkPasswordStringStrength(suggestedPassword)).build());
        }
        responseObserver.onCompleted();
    }

    private PasswordStrength checkPasswordStrength(Password password) {
        String passwordString = password.getPassword();
        return passwordService.checkPasswordStringStrength(passwordString);
    }

}
