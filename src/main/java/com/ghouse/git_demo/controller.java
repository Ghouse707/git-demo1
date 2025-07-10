package com.ghouse.git_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class controller {


    public String hello(){

        return "hello world";

    }

    public String bro(){

        return "kaise ho bro";
    }

    
}


