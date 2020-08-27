package com.spring.project.springboot.dao;

import com.spring.project.springboot.domain.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    void insertUser(User user);
    User getUserByEmail(String email);
}
