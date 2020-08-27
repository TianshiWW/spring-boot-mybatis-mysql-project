package com.spring.project.springboot.utils;

import com.spring.project.springboot.domain.User;
import com.spring.project.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;

@Component
public class SignUpUtils {
    @Autowired
    private UserService userService;

    public static SignUpUtils signUpUtils;
    @PostConstruct
    public void init() {
        signUpUtils = this;
    }

    public static boolean isUserExisted(String email) {
        User prev = signUpUtils.userService.getUserByEmail(email);
        return !Objects.isNull(prev);
    }
}
