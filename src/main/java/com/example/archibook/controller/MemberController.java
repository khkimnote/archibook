package com.example.archibook.controller;

import com.example.archibook.beans.vo.MemberVO;
import com.example.archibook.services.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("login")
    public String login(){
        log.info("-----login-----");
        return "member/login";
    }

    @GetMapping("join")
    public String join(){
        log.info("-----join-----");
        return "member/join";
    }

    @PostMapping("login")
    public String login(MemberVO memberVO, HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        MemberVO vo = memberService.login(memberVO);
        String id = vo.getMemberId();
        String name = vo.getMemberName();

        if(name.equals("홍길동")){
            return "redirect:/main/mainPage";
        }else{
            model.addAttribute("flag","false");
            return "/member/login";
        }
    }




}

