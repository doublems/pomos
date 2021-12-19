package org.doublem.org.pomos.model.user;

import lombok.Builder;
import lombok.Data;

@Builder
public class PomosUser {
    private String id;
    private String displayId;
    private String email;

    public PomosUser() {
    }

    public PomosUser(String id, String displayId, String email) {
        this.id = id;
        this.displayId = displayId;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getDisplayId() {
        return displayId;
    }

    public String getEmail() {
        return email;
    }
}
