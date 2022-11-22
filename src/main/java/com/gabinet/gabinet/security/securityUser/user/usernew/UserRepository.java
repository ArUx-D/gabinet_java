package com.gabinet.gabinet.security.securityUser.user.usernew;

import com.gabinet.gabinet.security.securityUser.user.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SecurityUser, Long> {
}
