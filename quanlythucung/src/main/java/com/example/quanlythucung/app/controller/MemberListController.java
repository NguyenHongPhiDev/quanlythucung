package com.example.quanlythucung.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class MemberListController {
    @RequestMapping(value = {"/dog/","/dog"})
    public String dogProduct(){

        return "product/dog/thucan" ;
    }
}
