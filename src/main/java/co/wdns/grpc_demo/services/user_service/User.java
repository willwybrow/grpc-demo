package co.wdns.grpc_demo.services.user_service;

import co.wdns.grpc_demo.common.UserId;

public class User {
    private UserId userId;
    private boolean blocked = false;
    private String passwordHash;

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }


    User(UserId userId, String passwordHash) {
        this.userId = userId;
        this.passwordHash = passwordHash;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
