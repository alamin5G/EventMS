package com.rupcharcha.eventms.controller;


import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String home(HttpMethod httpMethod) {
        return "Welcome to Event Management System!";
    }
}
