package com.example.family.controller;

import com.example.family.domain.entity.User;
import com.example.family.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final User user = new User(000001, "mori", "morimori@mori.com");
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/list")
    public List<User> getAllUsers() {
        System.out.println("list");
        return userRepository.getAllUsers();
    }

    @GetMapping("test")
    public User test() {
        System.out.println("test");
        return user;
    }

    @PostMapping("/save")
    public void saveUser(User user) {
        System.out.println("list");
        userRepository.save(user);
    }
}
