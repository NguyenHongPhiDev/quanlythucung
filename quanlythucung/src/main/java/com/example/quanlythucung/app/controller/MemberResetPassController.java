package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.dto.in.MemberResetPassword;
import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Random;

@Controller
@RequestMapping("/resetPassword")
public class MemberResetPassController {
    @Inject
    UserService userService;
    private static final Integer lengthPassword = 8;
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;
    private static final Random generator = new Random();
    @RequestMapping(value = {"/",""})
    public String registerMemberInit(Model model){
        model.addAttribute("styleSheet","web/index.css");
        model.addAttribute("js","User/resetPassword.js");
        return "login/resetPass";
    }
    @ResponseBody
    @RequestMapping(value = {"/reset","/reset/"},method = RequestMethod.POST)
    public String registerMember(MemberResetPassword user, Model model){
        User  user1 = userService.findOne(user.getUserName());
        if(user1== null){
            return "1";
        }else if(!user.getEmail().equals(user1.getEmail())){
            return "2";
        }
        String passwordReset = randomAlphaNumeric(lengthPassword);
        userService.changePassword(user1.getUsername(),passwordReset);
        return passwordReset;
    }
    public String randomAlphaNumeric(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }
}
