package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.security.Principal;

@Controller
@RequestMapping("/nap-the")
public class CardController {
    @Inject
    UserService userService;
    @RequestMapping(value = {"/",""},method = RequestMethod.GET)
    public String card(Model model){
        model.addAttribute("title","Nạp thẻ");
        model.addAttribute("js","card/cardUser.js");
        return "account/card";
    }
    @RequestMapping(value = {"/send","/send/"})
    @ResponseBody
    public String napThe(Principal principal, @RequestParam(value = "price")float price){
        userService.updateBalance(principal.getName(),price);
        return String.valueOf(price);
    }
}
