package co.wdns.grpc_demo.repositories;

import co.wdns.grpc_demo.common.UserId;
import co.wdns.grpc_demo.user_service.AccessToken;
import co.wdns.grpc_demo.user_service.AccessTokenId;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class AccessTokenRepository {
    private ConcurrentHashMap<AccessTokenId, AccessToken> accessTokens;
    private ConcurrentHashMap<UserId, List<AccessTokenId>> byUserId;

    public AccessTokenRepository() {
        this.accessTokens = new ConcurrentHashMap<>();
        this.byUserId = new ConcurrentHashMap<>();
    }

    public void saveAccessToken(AccessToken accessToken) {
        accessTokens.put(accessToken.getId(), accessToken);
        byUserId.putIfAbsent(accessToken.getUserId(), Collections.synchronizedList(new ArrayList<>()));
        synchronized (byUserId.get(accessToken.getUserId())) {
            byUserId.get(accessToken.getUserId()).add(accessToken.getId());
        }
    }

    public void deleteAccessTokens(UserId userId) {
        byUserId.getOrDefault(userId, new ArrayList<>()).stream()
                .map(accessTokens::remove);
    }

    public AccessToken getAccessToken(AccessTokenId accessTokenId) {
        return accessTokens.get(accessTokenId);
    }

    public void deleteAccessToken(UserId userId) {

    }
}
