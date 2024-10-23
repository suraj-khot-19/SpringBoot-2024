package com.suraj.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String greet(){
     return "Welcome to my project";
    }

    @RequestMapping("/about")
    public String about(){
        return  "This is about Page";
    }
}

/*
using controller and response, RequestMapping body we send data to server

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String greet(){
     return "Welcome to my project";
    }
}
 */
