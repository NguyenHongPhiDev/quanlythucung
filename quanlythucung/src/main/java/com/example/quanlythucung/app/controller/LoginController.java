package com.example.quanlythucung.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginController {
    public String login(){
        return "/login";
    }
}
