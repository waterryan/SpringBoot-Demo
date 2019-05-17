package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/main")
    public String main(){
        System.out.println("----> MainController");
        return "main";
    }
}