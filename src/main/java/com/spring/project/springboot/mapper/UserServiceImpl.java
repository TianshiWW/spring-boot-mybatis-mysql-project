package com.spring.project.springboot.mapper;

import com.spring.project.springboot.dao.UserDao;
import com.spring.project.springboot.model.Employee;
import com.spring.project.springboot.model.User;
import com.spring.project.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<Employee> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public void insertUser(Employee employee) {
        userDao.insertUser(employee);
    }

}
