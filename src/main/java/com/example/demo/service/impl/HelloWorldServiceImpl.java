package com.example.demo.service.impl;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

//@Service
public class HelloWorldServiceImpl implements HelloService {

    @Override
    public String getHelloWorld() {
        return "Hello World!!";
    }
}
