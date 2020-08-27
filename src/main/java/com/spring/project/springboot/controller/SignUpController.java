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

@Controller
public class SignUpController {
    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String sign(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute User user, Model model) {
        if (SignUpUtils.isUserExisted(user.getEmailAddress())) {
            model.addAttribute("message", "error");
        } else {
            userService.insertUser(user);
            model.addAttribute("message", "success");
        }
        return "signupsuccess";
    }
}
