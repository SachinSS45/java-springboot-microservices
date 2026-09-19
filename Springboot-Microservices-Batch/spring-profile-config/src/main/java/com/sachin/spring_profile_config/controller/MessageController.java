package com.sachin.spring_profile_config.controller;

import com.sachin.spring_profile_config.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Slf4j
public class MessageController {

    private final MessageService messageService;
    @GetMapping("/message-service")
    public String message(){
        log.info("Calling getMessage()...");
        return messageService.getMessage();
    }
}
