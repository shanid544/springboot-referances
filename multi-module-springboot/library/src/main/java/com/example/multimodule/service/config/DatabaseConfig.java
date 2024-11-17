package com.example.multimodule.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    @Bean
    public String databaseBean() {
        return "Database Bean Configured";
    }
}
