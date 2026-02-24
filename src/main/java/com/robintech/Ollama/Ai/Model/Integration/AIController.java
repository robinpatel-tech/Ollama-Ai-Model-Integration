package com.robintech.Ollama.Ai.Model.Integration;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AIController {

    private final ChatModel chatModel;

    // Constructor injection ensures the bean is wired correctly
    public AIController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/{prompt}")
    public String getAnswer(@PathVariable("prompt") String prompt) {
        return chatModel.call(prompt);
    }
}
