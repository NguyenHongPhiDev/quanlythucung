package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.security.Principal;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Inject
    UserService userService;
    @RequestMapping(value = {"","/"})
    public String accountInit( Principal principal, Model model){
        User user = userService.findOne(principal.getName());
        model.addAttribute("user",user);
        return "account/index";
    }
    @RequestMapping(value = {"","/"},method = RequestMethod.POST,params = "update")
    public String update( Principal principal,@ModelAttribute("userUpdate") User user){
        user.setUsername(principal.getName());
        userService.update(user);
        return "redirect:/account";
    }
    @RequestMapping(value = {"/password","/password/"})
    public String changePassword(){
        return "account/changePassword";
    }
}
