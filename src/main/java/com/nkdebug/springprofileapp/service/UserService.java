package com.nkdebug.springprofileapp.service;

import com.nkdebug.springprofileapp.model.User;
import com.nkdebug.springprofileapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Profile({"local","dev","prod"})
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> persistUser(List<User> users) {
      // Assert.notNull(users, "User object should not be null");
        if(users.isEmpty() || users.size() == 0) {
            throw new IllegalStateException("User object should not be null");
        }
        return userRepository.saveAll(users);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
