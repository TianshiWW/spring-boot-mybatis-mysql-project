package com.spring.project.springboot.controller;

import com.spring.project.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @RequestMapping (value = "/home", method = RequestMethod.GET)
    public String helloWorld(@RequestParam(name ="name", required = false, defaultValue = "world") String name, Model model) {
        model.addAttribute("user", new User());
        return "home";
    }
}
