package com.microsoft.azure.spring.example.microservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello, SpringBoot!";
    }

    @RequestMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam("content") String content){
        return content;
    }
}
