package com.willdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeSpring {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to a Spring Boot Rest API";
    }

}
