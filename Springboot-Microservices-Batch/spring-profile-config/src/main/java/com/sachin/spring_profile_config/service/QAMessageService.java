package com.sachin.spring_profile_config.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
@Slf4j
public class QAMessageService implements MessageService{
    @Override
    public String getMessage() {
        log.info("Returning message from QA Profile Service");
        return "Hello from QA Environment";
    }
}
