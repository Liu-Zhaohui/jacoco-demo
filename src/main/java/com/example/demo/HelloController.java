package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say() {
        return "Hello World!";
    }

    @RequestMapping("byebye")
    public String byebye() {
        return "byebye!";
    }

    @RequestMapping("v1")
    public String v1() {
        return "version 1!";
    }

}
