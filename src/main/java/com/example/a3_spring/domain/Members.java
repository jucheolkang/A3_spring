package com.example.a3_spring.domain;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor  // constructo은 생성자를 생성, no는 매개변수 없음, all은 모든것 re~는 일부분(notnull 있는것만)
@AllArgsConstructor
@Entity
@Data
@Builder

public class Members {
    // 회원 id,pw,이름을 저장
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/ // id 값을 자동으로 넣어준다(여기서는 필요 없다)
    private String user_id;

    @Column(nullable = false)
    private String user_pw;

    @Column(nullable = false)
    private String user_name;



}
