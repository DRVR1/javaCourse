package com.example.spring_ai2.controller;

//import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/swagger-ui/index.html
// Aparte de descomentar, hay que descomentar la dependencia en pom.xml, y configurar la api key en application.properties
@RestController
public class MainController {

//    @Autowired
//    private OpenAiChatModel chatModel;
//
//    //@GetMapping("/ask")
//    public String ask(@RequestParam String prompt) {
//        String response = chatModel.call(prompt);
//        return response;
//    }
}