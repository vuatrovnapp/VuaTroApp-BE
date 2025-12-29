package com.example.VuaTroVN_BE.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    // This is a placeholder for the actual implementation of HelloController

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, CI/CD!";
    }
}