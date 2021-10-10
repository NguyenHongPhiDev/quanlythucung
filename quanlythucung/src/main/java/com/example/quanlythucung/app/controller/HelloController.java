package com.example.quanlythucung.app.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory
            .getLogger(HelloController.class);

    @RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Locale locale, Model model) {
        return "welcome/home";
    }
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home1(Locale locale, Model model) {
        return "layout/index";
    }

}
