package com.dev.backend.user.service.impl;

import com.dev.backend.mapper.UserMapper;
import com.dev.backend.user.model.User;
import com.dev.backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public User getUser(long id) {
        return userMapper.findUserById(id);
    }
}
