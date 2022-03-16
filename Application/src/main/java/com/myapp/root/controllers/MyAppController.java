package com.myapp.root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
    
    @RequestMapping("/test")
    public String index() {
        return "index.html";
    }
}
