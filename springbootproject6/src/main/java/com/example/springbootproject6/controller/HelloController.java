package com.example.springbootproject6.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject6.entity.AppUser;
import com.example.springbootproject6.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String greet(CsrfToken csrfToken, HttpServletRequest request) {
        return "Hello world! " + request.getSession().getId();
    }

    @PostMapping("/post")
    public String post(HttpServletRequest request) {
        return "Post";
    }

    @PostMapping("/registrar")
    public AppUser postMethodName(@RequestBody AppUser user) {
        return userService.save(user);
    }

}
