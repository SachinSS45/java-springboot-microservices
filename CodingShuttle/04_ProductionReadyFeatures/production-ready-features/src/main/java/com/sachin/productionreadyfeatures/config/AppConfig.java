package com.sachin.productionreadyfeatures.config;

import com.sachin.productionreadyfeatures.auth.AuditorAwareImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AppConfig {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    AuditorAwareImpl auditorAware(){
        return new AuditorAwareImpl();
    }
}
