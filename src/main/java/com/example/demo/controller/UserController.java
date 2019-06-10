package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/save")
    public String save() {
        User user = new User();
        user.setLoginname("Alex");
        user.setSex('m');
        user.setAge(10);
        userService.save(user);
        return "saved!";
    }

    @RequestMapping("/update")
    public String update() {
        User user = userService.getById(1);
        userService.update(user);
        return "updated!";
    }

    @RequestMapping("/delete")
    public String delete() {
        userService.delete(1);
        return "deleted!";
    }

    @RequestMapping("/getAll")
    public Iterable<User> getAll() {
        return userService.getAll();
    }
}
