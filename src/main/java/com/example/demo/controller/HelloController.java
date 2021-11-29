package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("world")
    public String getHello(){
        String helloWorld = helloService.getHelloWorld();
        return helloWorld;
    }
}
