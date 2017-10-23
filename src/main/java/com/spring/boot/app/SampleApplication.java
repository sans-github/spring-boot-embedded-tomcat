package com.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.spring.boot.controller")
public class SampleApplication {
    public static void main(final String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
