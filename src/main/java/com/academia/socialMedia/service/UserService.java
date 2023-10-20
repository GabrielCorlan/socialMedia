package com.academia.socialMedia.service;

import com.academia.socialMedia.exceptions.UserNotFoundException;
import com.academia.socialMedia.model.User;
import com.academia.socialMedia.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    } 

    public User getUserById(int userId) {
        Optional<User> first = userRepository.findById(userId);
        if (first.isEmpty()){
            throw new UserNotFoundException(userId);
        }
        return first.get();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
