package org.doublem.org.pomos.model.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PomosUser {
    String id;
    String displayId;
    String email;
}
