package com.example.sssaa__webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/v1")
public class Homecontroller {
        @GetMapping
    public String hello() {
            return"Hello World!";
        }
}
