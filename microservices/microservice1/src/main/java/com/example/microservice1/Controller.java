package com.example.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice1.feing.FeingInterface;

//http://localhost:8081/swagger-ui/index.html
@RestController
public class Controller {

    @GetMapping("/micro1")
    public String micro1() {
        return "service 1 - hello world";
    }

    @Autowired
    FeingInterface feingInterface;

    @GetMapping("/micro2")
    public String micro2() {
        return feingInterface.micro2();
    }

}
