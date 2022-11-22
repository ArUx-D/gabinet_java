package com.gabinet.gabinet.security.securityUser;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UsersPermissions {

    CLIENT_READ("client:read"),
    CLIENT_WRITE("client:write"),
    VISIT_READ("visit:read"),
    VISIT_WRITE("visit:write");

    private final String permissions;


}
