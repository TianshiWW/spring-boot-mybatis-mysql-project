package com.spring.project.springboot.controller;

import com.spring.project.springboot.domain.User;
import com.spring.project.springboot.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(@NonNull Model model) {
        model.addAttribute("user", new User());
        return "loginpage";
    }

    @PostMapping("/login")
    public String login(@NonNull @ModelAttribute User user, @NonNull Model model) {
        User currUser = userService.getUserByEmail(user.getEmailAddress());
        if (user.getPassword().equals(currUser.getPassword())) {
            currUser.setPassword(" ");
            model.addAttribute("user", currUser);
            return "usercenterpage";
        }
        model.addAttribute("errorMsg", "Fail to log in.");
        return "usercenterpage";
    }

}
