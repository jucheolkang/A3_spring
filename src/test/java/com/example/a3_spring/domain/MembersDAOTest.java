package com.example.a3_spring.domain;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback(false)
class MembersDAOTest {
    @Autowired
    MembersDAO userRepository;
    @DisplayName("add user test")
    @Test
    public void saveTest() {
        Members userEntity = Members.builder()
                .user_name("jucheol")
                .user_id("1234")
                .user_pw("ju9877")
                .build();

        Members savedUserEntity = userRepository.save(userEntity);
        System.out.println("userEntity >>>" + userEntity.toString());
        System.out.println("savedUserEntity >>>" + savedUserEntity.toString());
        Assertions.assertEquals("1234", savedUserEntity.getUser_id());
        Assertions.assertEquals("jucheol", savedUserEntity.getUser_name());
        Assertions.assertEquals("ju9877", savedUserEntity.getUser_pw());

    }
}