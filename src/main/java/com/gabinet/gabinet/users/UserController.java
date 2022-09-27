package com.gabinet.gabinet.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/add")
//    public User add(User user) {
//        return userService.add(user);
//    }
//
//    @GetMapping("/list")
//    public List<User> list() {
//        return userService.list();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<User> findById(@PathVariable Long id) {
//        return userService.findById(id);
//    }
//
//    @PostMapping("/{id}/delete")
//    public void deleteById(@PathVariable Long id){
//        userService.deleteById(id);
//    }

}
