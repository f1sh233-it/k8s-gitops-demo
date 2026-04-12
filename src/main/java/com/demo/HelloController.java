package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello kubernetes";
    }

    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}
