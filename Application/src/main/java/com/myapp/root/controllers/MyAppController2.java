package com.myapp.root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController2 {
    
    @RequestMapping(value = "/test")
    @ResponseBody
    public String getDataFromTestPath(){
            return "response from MyAppController2 /test path";
    }
}
