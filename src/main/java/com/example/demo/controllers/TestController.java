package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Hello World";
    }

    @GetMapping("/sample")
    public String sample(){
        return "sample";
    }
}
