package com.gabriel.openprompthub.controller;

import com.gabriel.openprompthub.model.OpenAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final OpenAIService openAIService;

    public ChatController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public String chat(@RequestBody String prompt) {
        return openAIService.chat(prompt);
    }
}