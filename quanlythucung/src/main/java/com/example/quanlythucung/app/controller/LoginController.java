package com.example.quanlythucung.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(value = {"/",""})
    public String loginHome(Model model){
        model.addAttribute("styleSheet","web/index.css");
        return "web/test";
    }
}
