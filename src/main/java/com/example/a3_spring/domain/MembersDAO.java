package com.example.a3_spring.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersDAO extends JpaRepository<Members,String> {
//    Members findAllByUser_id(String user_id); // 이메일 중복 검사
}

/*
        findAll() : 해당 엔티티 테이블에 있는 모든 데이터를 조회한다.
        save() : 대상 엔티티를 DB에 저장한다.
        saveAll() : Iterable 가능한 객체를 저장한다.
        delete() : 데이터베이스에서 대상 엔티티를 삭제한다.
*/
