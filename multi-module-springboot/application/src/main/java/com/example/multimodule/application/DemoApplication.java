package com.example.multimodule.application;

import com.example.multimodule.service.MyService;
import com.example.multimodule.service.config.DatabaseConfig;
import com.example.multimodule.service.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodule.application")
@RestController
@Import({DatabaseConfig.class, ServiceConfig.class,MyService.class})
public class DemoApplication {

  private final MyService myService;

  public DemoApplication(MyService myService) {
    this.myService = myService;
  }

  @GetMapping("/")
  public String home() {
    return myService.message();
  }

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    // Retrieve beans from the context
    String databaseBean = (String) context.getBean("databaseBean");
    String serviceBean = (String) context.getBean("serviceBean");

    // Print the results
    System.out.println(databaseBean); // Output: Database Bean Configured
    System.out.println(serviceBean);  // Output: Service Bean Configured
  }
}