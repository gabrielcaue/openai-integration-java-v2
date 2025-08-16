package com.gabriel.openprompthub.controller;

import com.gabriel.openprompthub.controller.ChatRequest;
import com.gabriel.openprompthub.model.OpenAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prompts")
public class PromptController {

    private final OpenAIService openAIService;

    public PromptController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/chat")
    public String gerarResposta(@RequestBody ChatRequest request) {
        return openAIService.chat(request.getPrompt());
    }
}