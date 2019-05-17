package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;


@Controller
public class ThymeleafController {

//    @RequestMapping("/leaf")
//    public String hello(Map<String, Object> map) {
//        map.put("name", "Ryan");
//        return "leaf";
//    }

    @RequestMapping("/iftest")
    public String iftest(WebRequest webRequest){
        webRequest.setAttribute("username", "Ryan", webRequest.SCOPE_REQUEST);
        webRequest.setAttribute("age", 21, webRequest.SCOPE_REQUEST);
        webRequest.setAttribute("role", "admin", webRequest.SCOPE_REQUEST);
        return "leaf";
    }
}
