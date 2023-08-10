package com.example.a3_spring.controller;

import com.example.a3_spring.controller.dto.MembersDto;
import com.example.a3_spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class GetUserInfo {
    private final UserService userService;
    @PostMapping("/api/v1/posts")
    public String save(@RequestBody MembersDto membersDto){
        return userService.save(membersDto);
    }
}
