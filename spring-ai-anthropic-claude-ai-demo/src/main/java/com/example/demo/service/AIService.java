package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ai.anthropic.AnthropicService;
import org.springframework.ai.anthropic.model.CompletionRequest;
import org.springframework.ai.anthropic.model.CompletionResponse;

@Service
public class AIService {

    private final AnthropicService anthropicService;

    @Autowired
    public AIService(AnthropicService anthropicService) {
        this.anthropicService = anthropicService;
    }

    public String getAIResponse(String prompt) {
        CompletionRequest request = new CompletionRequest();
        request.setPrompt(prompt);
        request.setMaxTokens(150);  // Adjust as necessary

        CompletionResponse response = anthropicService.completions(request);
        return response.getText();
    }
}
