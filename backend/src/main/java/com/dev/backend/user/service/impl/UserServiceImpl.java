package com.dev.backend.user.service.impl;

import com.dev.backend.mapper.UserMapper;
import com.dev.backend.user.model.User;
import com.dev.backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public User getUser(long id) {
        return userMapper.findUserById(id);
    }

    public List<User> getAllUsers() {

        return userMapper.findAllUsers();
    }

    public User createUser(User user) {

        userMapper.insertUser(user);

        return null;
    }

    public User updateUser(User user) {
        userMapper.updateUser(user);
        return null;
    }

    public User deleteUser(long id) {

        return null;
    }

}
