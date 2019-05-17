package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @PostMapping("login")
    public ModelAndView login(
            @RequestParam("loginName") String loginName,
            @RequestParam("password") String password,
            ModelAndView mv
    ){
        System.out.println("----> LoginController");
        System.out.println("----> loginName: " + loginName + ", Password: " + password);
        mv.setViewName("redirect:/main");
        return mv;
    }
}
