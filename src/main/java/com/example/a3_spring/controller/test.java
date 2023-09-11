package com.example.a3_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class test {
    @GetMapping()
    public String test(){
        return "hello, run system";
    }
}
