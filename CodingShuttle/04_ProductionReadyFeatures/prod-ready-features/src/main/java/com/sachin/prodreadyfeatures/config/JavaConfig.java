package com.sachin.prodreadyfeatures.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
