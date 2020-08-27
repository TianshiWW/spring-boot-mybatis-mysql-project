package com.spring.project.springboot.controller;

import com.spring.project.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping("/")
    public String helloWorld() {
        return "welcomepage";
    }
}
