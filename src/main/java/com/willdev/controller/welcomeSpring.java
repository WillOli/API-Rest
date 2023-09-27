package com.willdev.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeSpring {

    public String welcome() {
        return "Welcome to a Spring Boot Rest API";
    }

}
