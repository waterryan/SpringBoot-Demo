package com.example.demo.controller;

import com.example.demo.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/***
 * 用于演示thymeleaf模版的功能
 */
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

    @RequestMapping("/eachtest")
    public String eachtest(WebRequest webRequest){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "book1", "Alex", "1.png"));
        books.add(new Book(2, "book2", "Bob", "2.png"));
        books.add(new Book(3, "book3", "Cathy", "3.png"));
        webRequest.setAttribute("books", books, webRequest.SCOPE_REQUEST);
        return "books";
    }
}
