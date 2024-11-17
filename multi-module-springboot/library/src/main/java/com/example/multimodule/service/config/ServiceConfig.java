package com.example.multimodule.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public String serviceBean() {
        return "Service Bean Configured";
    }
}
