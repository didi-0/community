package com.newcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @RequestMapping("/Hello")
    @ResponseBody
    public String sayHello(){
        return "Hello Spring Boot";
    }
}
