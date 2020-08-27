package com.spring.project.springboot.controller;

import com.spring.project.springboot.model.Employee;
import com.spring.project.springboot.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUser")
    public List<Employee> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping(value = "/insert")
    public void insert(@Param("id") int id,
                       @Param("firstName") String firstName,
                       @Param("lastName") String lastName,
                       @Param("emailAddress") String emailAddress) {
        Employee employee = new Employee(id, firstName, lastName, emailAddress);
        userService.insertUser(employee);
    }
}
