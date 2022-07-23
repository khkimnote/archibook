package com.example.archibook.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/book/*")
@RequiredArgsConstructor
public class BookController {

    @GetMapping("list")
    public String list(){

        log.info("-------------------------------");
        log.info("list");
        log.info("-------------------------------");


        return "book/list";
    }

    // url : http://localhost:10010/book/dreamView
    @GetMapping("dreamView")
    public String dreamView(){
        log.info("-------------------------------");
        log.info("dreamView");
        log.info("-------------------------------");

        return "book/dreamView";
    }


    @GetMapping("Viewer")
    public String Viewer(){
        log.info("-------------------------------");
        log.info("홍길동 Viewer");
        log.info("-------------------------------");

        return "book/Viewer";
    }


}







