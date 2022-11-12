package com.t1.t1.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Objects;

@RestController

@RequestMapping("/api/v1")
public class controller {


    @GetMapping("/form")
    public String getForm() {
        return "form";
    }

    @GetMapping("/lab1")
    public String getLab1() {
        return "lab1";
    }
    @GetMapping("/books/{id}")
    public Object getOne(@PathVariable long id){
        System.out.println("-------------id: "+id);
        HashMap<String, Object> book = new HashMap<>();
        book.put("name","1");
        book.put("isbn","2");
        book.put("cvasdfg","3");
        return book;
    }
}
