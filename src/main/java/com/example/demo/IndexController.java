package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class IndexController {


    @RequestMapping(value = "/")
    public String index(Map<String, Object> map){
        System.out.println("----> index.html");
        map.put("name", "Ryan");
        return "index";
    }
}