package com.gabriel.openprompthub.model;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@Service
public class OpenAIService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiKey = "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";
    private final String url = "https://api.openai.com/v1/chat/completions";

    public String chat(String prompt) {
        // 1. Monta o corpo da requisição
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "gpt-3.5-turbo");

        List<Map<String, String>> messages = new ArrayList<>();
        messages.add(Map.of("role", "user", "content", prompt));
        requestBody.put("messages", messages);

        // 2. Define os headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

        // 3. Faz a requisição POST
        ResponseEntity<Map> response = restTemplate.postForEntity(url, entity, Map.class);

        // 4. Extrai a resposta
        List<Map<String, Object>> choices = (List<Map<String, Object>>) response.getBody().get("choices");
        Map<String, Object> message = (Map<String, Object>) choices.get(0).get("message");

        return (String) message.get("content");
    }
}