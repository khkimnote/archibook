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
    public void login(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        model.addAttribute("memberId", session.getAttribute("memberId"));
    }

    @GetMapping("join")
    public void join(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        model.addAttribute("memberId", session.getAttribute("memberId"));
    }




}

