package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorld1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld1Application.class);
    }


    @RequestMapping("/")
    String helloWorld() {
        String s="1. This Is First Jenkins Deployment By Ankit Rai";
        return s;
    }

}
