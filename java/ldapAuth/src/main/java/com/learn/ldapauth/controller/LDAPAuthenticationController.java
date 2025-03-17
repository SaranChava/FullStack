package com.learn.ldapauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LDAPAuthenticationController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World!";
    }
}
