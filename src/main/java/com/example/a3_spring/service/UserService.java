package com.example.a3_spring.service;

import com.example.a3_spring.domain.Members;
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
//        validateDuplicateMember(membersDto);
        return membersDAO.save(membersDto.toEntity()).toString();
    }
    /*private void validateDuplicateMember(MembersDto member) {
        Members findMember = membersDAO.(member.getUser_id());
        if (findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }*/



    @Transactional
    public void delete (String id){
        Members members = membersDAO.findById(id).orElseThrow(()->new IllegalArgumentException("해당 회원이 없습니다 id =" + id));
        membersDAO.delete(members);
    }
}
