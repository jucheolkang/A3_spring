package com.example.a3_spring.controller;

import com.example.a3_spring.controller.dto.MembersDto;
import com.example.a3_spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/userinfo")
public class GetUserInfo {
    private final UserService userService;
    @PostMapping("/new")
    public String save(@RequestBody MembersDto membersDto){
        return userService.save(membersDto);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        userService.delete(id);
        return id;
    }



}
