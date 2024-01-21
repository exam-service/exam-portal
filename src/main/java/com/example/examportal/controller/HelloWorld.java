package com.example.examportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello-world")
public class HelloWorld {

    @GetMapping
    public String getMessage() {
        return "Hello from Exam Portal Server...";
    }


}
