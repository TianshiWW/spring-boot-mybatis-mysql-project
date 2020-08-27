package com.spring.project.springboot.dao;

import com.spring.project.springboot.model.Employee;
import com.spring.project.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<Employee> getAllUser();
    void insertUser(Employee employee);
}
