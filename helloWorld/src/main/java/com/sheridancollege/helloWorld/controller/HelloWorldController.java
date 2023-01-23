package com.sheridancollege.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World Created by Inderdeep Kaur";
    }
}
