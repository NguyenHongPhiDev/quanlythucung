package com.example.quanlythucung.app.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = {"/","/index"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model) {
        return "web/index";
    }
}
