package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/register")
public class MemberRegisterController {
    @Inject
    UserService userService;
    @RequestMapping(value = {"/",""})
    public String registerMemberInit(Model model){
        model.addAttribute("styleSheet","web/index.css");
        return "login/register";
    }
    @RequestMapping(value = {"/",""},params = "register")
    public String registerMember(@ModelAttribute("memberRegister")User user, Model model){
        userService.create(user);
        return "redirect:/login";
    }
}
