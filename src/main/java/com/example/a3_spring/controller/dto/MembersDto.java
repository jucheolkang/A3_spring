package com.example.a3_spring.controller.dto;

import com.example.a3_spring.domain.Members;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor

public class MembersDto {
    private String user_id;
    private String user_pw;
    private String user_name;
    @Builder
    public MembersDto(String user_id, String user_pw, String user_name){
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.user_name = user_name;

    }
    public Members toEntity(){
        return Members.builder()
                .user_id(user_id).user_pw(user_pw).user_name(user_name).build();
    }
}
