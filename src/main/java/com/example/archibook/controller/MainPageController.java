package com.example.archibook.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/main/*")
@RequiredArgsConstructor
public class MainPageController {

    @GetMapping("mainPage")
    public String list(){

        return "main/mainPage";
    }

// url: localhost:10010/QnA
    @GetMapping("QnA")
    public String QnA(){
        return "main/QnA";
    }

    @GetMapping("qna_mail")
    public String QnA_mail(){
        return "main/qna_mail";
    }

}