package com.example.springbootproject6.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject6.entity.AppUser;
import com.example.springbootproject6.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;

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

    @PostMapping("/registrar")
    public AppUser postMethodName(@RequestBody AppUser user) {
        return userService.save(user);
    }

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@RequestBody AppUser user) {

        Authentication auth = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (auth.isAuthenticated()) {
            return "Logged in";
        } else {
            return "Not logged";
        }
    }

}
