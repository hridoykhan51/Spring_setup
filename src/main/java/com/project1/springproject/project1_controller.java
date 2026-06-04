package com.project1.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class project1_controller {
    @GetMapping("/Hello")
    public String Hello(){
        return "Hello World";
    }
}
