package com.sachin.spring_profile_config.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EnvironmentController {

    public final Environment environment;

    public EnvironmentController(Environment environment) {
        this.environment = environment;
    }
    @GetMapping("/env")
    public String getEnvDetails(){
        String activeProfile = String.join(",",environment.getActiveProfiles());
        String appMessage = environment.getProperty("app.message");
        return "Active Profile : " + activeProfile + "\n" + "Message : " + appMessage;
    }
}
