package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private final MessageService service;

    public HelloController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return service.getMessage();
    }
}