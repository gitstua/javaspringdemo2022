package com.myapp.root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
    
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String getDataFromTestPath(){
            return "response from testpath";
    }
}
