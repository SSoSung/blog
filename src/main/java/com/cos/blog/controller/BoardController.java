package com.cos.blog.controller;

import com.cos.blog.config.auth.PricipalDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {


    // @AuthenticationPrincipal PricipalDetail pricipal
    @GetMapping({"","/"})
    public String index(){
        return "index";
    }

    // USER 권한이 필요
    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "board/saveForm";
    }
}
