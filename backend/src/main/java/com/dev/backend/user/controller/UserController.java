package com.dev.backend.user.controller;

import com.dev.backend.user.model.User;
import com.dev.backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

}
