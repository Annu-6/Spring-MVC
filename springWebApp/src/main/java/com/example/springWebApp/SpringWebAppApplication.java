package com.example.springWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebAppApplication.class, args);
        System.out.println("hi");
    }

}