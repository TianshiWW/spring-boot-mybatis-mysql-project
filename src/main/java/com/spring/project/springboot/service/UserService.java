package com.spring.project.springboot.service;

import com.spring.project.springboot.model.Employee;
import com.spring.project.springboot.model.User;

import java.util.List;


public interface UserService {

    List<Employee> getAllUser();

    void insertUser(Employee employee);
}
