package com.example.quanlythucung.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(value = {"/memberList/","memberList"})
    public String memberList(){
        return "admin/memberList";
    }
}
