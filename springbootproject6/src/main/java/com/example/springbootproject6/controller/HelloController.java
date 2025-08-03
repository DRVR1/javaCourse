package com.example.springbootproject6.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(CsrfToken csrfToken, HttpServletRequest request) {
        return "Hello world! " + request.getSession().getId() + " token: "
                + csrfToken.getToken();
    }

    @PostMapping("/post")
    public String post(HttpServletRequest request) {
        return "Post";
    }

}
