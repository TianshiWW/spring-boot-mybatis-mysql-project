package com.spring.project.springboot.service;

import com.spring.project.springboot.domain.User;

import java.util.List;


public interface UserService {

    List<User> getAllUser();

    void insertUser(User user);

    User getUserByEmail(String email);
}
