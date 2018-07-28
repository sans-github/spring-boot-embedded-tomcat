package com.spring.boot.app;

import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication(scanBasePackages = "com.spring.boot.controller")
public class Application {
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
