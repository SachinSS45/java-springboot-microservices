package com.sachin.first_rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello : Your First API";
    }

    //@GetMapping("/user")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        User user = new User(1,"Sachin","Shetkar");
        return user;
    }
}
