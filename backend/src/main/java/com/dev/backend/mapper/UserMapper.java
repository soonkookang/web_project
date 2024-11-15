package com.dev.backend.mapper;

import com.dev.backend.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> findAllUsers();
    User findUserById(long id);
    void insertUser(User user);
}
