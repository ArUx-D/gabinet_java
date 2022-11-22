package com.gabinet.gabinet.security.securityUser.user.usernew;

import com.gabinet.gabinet.security.securityUser.user.SecurityUser;
import com.gabinet.gabinet.security.securityUser.user.usernew.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public SecurityUser addUser(SecurityUser user) {
        return userRepository.save(user);
    }

    public List<SecurityUser> all(){
        return userRepository.findAll();
    }

    public Optional<SecurityUser> findById(Long id) {
        return userRepository.findById(id);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }


}
