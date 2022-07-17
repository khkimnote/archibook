package com.example.archibook.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("login")
    public String login(){

        return "member/login";
    }

    @GetMapping("join")
    public String join(){

        return "member/join";
    }

}
