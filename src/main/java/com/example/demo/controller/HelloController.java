package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("code")
    public String getCode(@RequestBody User user){
        return "一个小测试" + user.toString();
    }
}
