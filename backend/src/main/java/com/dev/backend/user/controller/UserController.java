package com.dev.backend.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {



    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return id;
    }
}
