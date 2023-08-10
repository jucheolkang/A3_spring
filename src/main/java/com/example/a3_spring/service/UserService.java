package com.example.a3_spring.service;

import com.example.a3_spring.domain.MembersDAO;
import com.example.a3_spring.controller.dto.MembersDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final MembersDAO membersDAO;

    @Transactional
    public String save(MembersDto membersDto){
        return membersDAO.save(membersDto.toEntity()).toString();
    }

}
