package com.example.spring_ai2.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
// http://localhost:8080/swagger-ui/index.html
public class OllamaController {

    private ChatClient chatClient;

    public OllamaController(OllamaChatModel chatModel) {
        this.chatClient = ChatClient.create(chatModel);
    }

    @Autowired
    EmbeddingModel embeddingModel;

    /*
     * Ejemplo de respuesta:
     * <think>
     * Okay, the user said "hi". Let me think about how to respond.
     * First, I should greet them back in a friendly and approachable way. Since
     * they just said "hi", it's probably a casual greeting...
     * </think>
     * Hi there! 👋 How can I assist you today?
     */
    @GetMapping("/prompt/{prompt}")
    public String prompt(@PathVariable String prompt) {
        ChatResponse chatResponse = chatClient.prompt(prompt).call().chatResponse();
        System.out.println(chatResponse.getMetadata()); // Tokens, uso, rate limit...
        String response = chatResponse.getResult().getOutput().getText(); // Pensamiento + respuesta final
        System.out.println(response);
        return response;

    }

    // http://localhost:8080/ask/movie?movie=matrix
    @GetMapping("/movie/{movie}")
    public String movie(@PathVariable String movie) {

        String template = "I need you to tell me about the following movie: {movie}";
        PromptTemplate promptTemplate = new PromptTemplate(template);
        Prompt prompt = promptTemplate.create(Map.of("movie", movie));

        ChatResponse chatResponse = chatClient.prompt(prompt).call().chatResponse();
        System.out.println(chatResponse.getMetadata()); // Tokens, uso, rate limit...
        String response = chatResponse.getResult().getOutput().getText(); // Pensamiento + respuesta final
        System.out.println(response);
        return response;
    }

    @PostMapping("/embedding/{text}")
    public float[] embedding(@PathVariable String text) {
        return embeddingModel.embed(text);
    }

}
