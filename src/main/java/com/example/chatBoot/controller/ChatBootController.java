package com.example.chatBoot.controller;

import com.example.chatBoot.service.ChatBootService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ChatBootController {

    private final ChatBootService chatBootService;

    public ChatBootController(ChatBootService chatBootService) {
        this.chatBootService = chatBootService;
    }

    @PostMapping
    public String responder(@RequestBody String pergunta){
        return chatBootService.responder(pergunta);
    }
}
