package com.example.archibook.services;

import com.example.archibook.beans.dao.MemberDAO;
import com.example.archibook.beans.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    private final MemberDAO memberDAO;
    public void join(MemberVO memberVO){memberDAO.join(memberVO);}
    public int checkId(String memberId){return memberDAO.checkId(memberId);}
    public MemberVO login(MemberVO memberVO){return memberDAO.login(memberVO);}

}
