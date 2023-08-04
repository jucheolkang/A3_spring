package com.example.a3_spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GetUserInfo {
    @PostMapping("/User")
    public void user(){

    }
}
