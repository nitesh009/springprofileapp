package com.nkdebug.springprofileapp.controller;

import com.nkdebug.springprofileapp.model.User;
import com.nkdebug.springprofileapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public List<User> persistUser(@RequestBody List<User> users) {
        return userService.persistUser(users);
    }

}
