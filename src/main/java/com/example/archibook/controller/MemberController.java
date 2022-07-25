package com.example.archibook.controller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class MemberController {


    @GetMapping("login")
    public void login(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession(); //주석 :20220723 추후 커맨트 예정
        model.addAttribute("memberId", session.getAttribute("memberId")); //주석 :20220723 추후 커맨트 예정
    }

    @GetMapping("join")
    public void join(HttpServletRequest request, Model model){
        HttpSession session = request.getSession(); //주석 :20220723 추후 커맨트 예정
        model.addAttribute("memberId", session.getAttribute("memberId")); //주석 :20220723 추후 커맨트 예정
    }

    @GetMapping("findId")
    public String findId(){
        return "member/findId";

    }

    @GetMapping("findPw")
    public String findPw() {
        return "member/findPw";


    }

    @GetMapping("memberRemove")
    public String memberRemove() {
        return "member/memberRemove";


    }


    }
