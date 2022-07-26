package com.example.archibook.beans.dao;

import com.example.archibook.beans.vo.MemberVO;
import com.example.archibook.mappers.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDAO {

    private final MemberMapper memberMapper;

    public void join(MemberVO memberVO){memberMapper.insert(memberVO);}
    public int checkId(String memberId){return memberMapper.count(memberId);}
    public MemberVO login(MemberVO memberVO){return memberMapper.select(memberVO);}


}
