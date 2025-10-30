package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class HelloController {

    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        users.add(user);
        return "User added successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot Backend!";
    }

    @GetMapping("/vignesh")
    public String hi() {
        return "he is a good boy";    
    }
        
}
