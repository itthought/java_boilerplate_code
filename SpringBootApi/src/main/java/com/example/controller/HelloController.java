package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name)  {

        String message="You just create Spring Boot Example successfully";

        return message;
    }
}
