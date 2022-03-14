package de.neuefische.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myApp")
public class MyAppController {

    @GetMapping
    public String sayHello(){
        return "Hi there User!";
    }

    @GetMapping("/admin")
    public String sayHelloAdmin(){
        return "Hi there ADMIN!";
    }

}
