package com.learn24.importresorce_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImportresorceDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ImportresorceDemoApplication.class, args);

		String xmlBean = (String) context.getBean("xmlBean");

		System.out.println(xmlBean); // Output: Bean from XML Configuration in Spring Boot
	}

}
