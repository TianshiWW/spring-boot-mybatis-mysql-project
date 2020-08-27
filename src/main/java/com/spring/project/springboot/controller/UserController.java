package com.spring.project.springboot.controller;

import com.spring.project.springboot.domain.User;
import com.spring.project.springboot.service.UserService;
import com.spring.project.springboot.utils.SignUpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute User user, Model model) {
        if (SignUpUtils.isUserExisted(user.getEmailAddress())) {
            model.addAttribute("user", new User());
        } else {
            userService.insertUser(user);
            model.addAttribute("user", user);
        }
        return "signupsuccess";
    }
}
