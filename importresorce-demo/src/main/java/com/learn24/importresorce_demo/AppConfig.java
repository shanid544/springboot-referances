package com.learn24.importresorce_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:app-config.xml") // Import the XML configuration file
public class AppConfig {
}
