package com.academia.socialMedia.controller;

import com.academia.socialMedia.model.User;
import com.academia.socialMedia.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        return ResponseEntity.ok().body(allUsers);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable int userId){
        User userById = userService.getUserById(userId);
        return ResponseEntity.ok().body(userById);
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }

}
