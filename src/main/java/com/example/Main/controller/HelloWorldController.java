package com.example.Main.controller;

import com.example.Main.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHelloWorld() {
        return helloWorldService.sayHelloWorld();
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return helloWorldService.sayHelloWorld();
    }

}
