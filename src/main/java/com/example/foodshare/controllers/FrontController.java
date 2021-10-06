package com.example.foodshare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/createUser")
    public String createUser(){
        return "createuser";
    }

    @GetMapping("/createfood")
    public String page1(){
        return "createfoodform";
    }
}
