package com.example.microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// http://localhost:8082/swagger-ui/index.html
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World - Service 2";
    }
}
