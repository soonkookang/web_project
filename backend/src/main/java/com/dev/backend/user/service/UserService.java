package com.dev.backend.user.service;

import com.dev.backend.user.model.User;

import java.util.List;

public interface UserService {
    User getUser(long id);
    List<User> getAllUsers();
    User createUser(User user);
    User updateUser(User user);
}
