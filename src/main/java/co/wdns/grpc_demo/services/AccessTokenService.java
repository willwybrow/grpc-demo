package co.wdns.grpc_demo.services;

import co.wdns.grpc_demo.common.UserId;
import co.wdns.grpc_demo.repositories.AccessTokenRepository;
import co.wdns.grpc_demo.services.user_service.User;
import co.wdns.grpc_demo.user_service.AccessToken;
import co.wdns.grpc_demo.user_service.AccessTokenId;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class AccessTokenService {
    private final AccessTokenRepository accessTokenRepository;

    public AccessTokenService() {
        this.accessTokenRepository = new AccessTokenRepository();
    }

    public AccessToken createUserAccessToken(User user) {
        AccessToken accessToken = newAccessTokenForUser(user.getUserId());
        accessTokenRepository.saveAccessToken(accessToken);
        return accessToken;
    }

    public UserId userIdOfAccessTokenId(AccessTokenId accessTokenId) {
        return accessTokenRepository.getAccessToken(accessTokenId).getUserId();
    }

    public void deleteUserAccessTokens(User user) {
        accessTokenRepository.deleteAccessTokens(user.getUserId());
    }

    private static AccessToken newAccessTokenForUser(UserId userId) {
        return AccessToken.newBuilder()
                .setId(AccessTokenId.newBuilder().setId(UUID.randomUUID().toString()))
                .setUserId(userId)
                .setExpires(System.currentTimeMillis() + 3600000)
                .addScope("all")
                .build();
    }
}
