package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class KssApplication {

    public static void main(String[] args) {
        SpringApplication.run(KssApplication.class, args);
       
    }

}