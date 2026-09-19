package com.sachin.spring_profile_config.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
@Slf4j
public class DevMessageService implements MessageService{
    @Override
    public String getMessage() {
        log.info("Returning message from DEV Profile Service");
        return "Hello from Dev Environment";
    }
}
