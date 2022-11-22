package com.gabinet.gabinet.security.securityUser;

import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;

import java.util.Set;

import static com.gabinet.gabinet.security.securityUser.UsersPermissions.*;

@AllArgsConstructor
public enum UsersRoles {

    USER(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(CLIENT_WRITE, CLIENT_READ, VISIT_READ, VISIT_WRITE));

    private final Set<UsersPermissions> permissions;

}
