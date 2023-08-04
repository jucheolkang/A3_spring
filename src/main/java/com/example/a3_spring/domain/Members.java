package com.example.a3_spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor  // constructo은 생성자를 생성, no는 매개변수 없음, all은 모든것 re~는 일부분(notnull 있는것만)
@AllArgsConstructor
@Entity
@Data
@Builder
public class Members {
    // 회원 id,pw,이름을 저장
    @Id
    private String user_id;
    private String user_pw;


    private String user_name;
}
