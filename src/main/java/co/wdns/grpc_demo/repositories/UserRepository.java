package co.wdns.grpc_demo.repositories;

import co.wdns.grpc_demo.common.UserId;
import co.wdns.grpc_demo.services.user_service.User;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private ConcurrentHashMap<String, UserId> byUsername;
    private ConcurrentHashMap<UserId, User> registeredUsers;

    public UserRepository() {
        this.byUsername = new ConcurrentHashMap<>();
        this.registeredUsers = new ConcurrentHashMap<>();
    }

    public boolean usernameIsRegistered(String username) {
        return this.byUsername.containsKey(username.toLowerCase());
    }

    public void registerUser(String username, User user) {
        this.byUsername.put(username, user.getUserId());
        this.registeredUsers.put(user.getUserId(), user);
    }

    public User getUser(UserId userId) {
        return registeredUsers.get(userId);
    }

    public User getUser(String username) {
        return getUser(byUsername.get(username));
    }
}
