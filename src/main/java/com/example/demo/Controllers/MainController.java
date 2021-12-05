package com.example.demo.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private Environment env;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Home";
    }

    @GetMapping("/env")
    @ResponseBody
    public Map<String, String> env() {
        Map<String, String> data = new HashMap<>();
        data.put("port", env.getProperty("server.port"));
        data.put("variable1", env.getProperty("variable1"));
        return data;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
