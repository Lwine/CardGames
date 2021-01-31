package com.company.card.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String helloSpringBoot() {
        return "Hello SpringBoot!";
    }
}
