package com.alfintech.aimHigh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(name = "/")
    public String getId() {
        return "I am Alfin -> " ;
    }
}
