package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.dto.Result;
import com.example.quanlythucung.domain.dto.in.MemberChangePassword;
import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import javax.inject.Inject;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Inject
    UserService userService;
    @Inject
    PasswordEncoder passwordEncoder;

    private List<String> errLst = new ArrayList<String>();
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
    public String changePasswordInit(@ModelAttribute("memberChangePassword")MemberChangePassword memberChangePassword,Model model, BindingResult result){
        if (result.hasErrors()) {
            if (errLst.isEmpty()) {
                for( ObjectError error : result.getAllErrors() ) {
                    errLst.add(error.getDefaultMessage());
                }
            }
        }
        model.addAttribute("errLst",errLst);
        return "account/changePassword";
    }
    @RequestMapping(value = {"/password","/password/"},method = RequestMethod.POST, params = "change")
    public String changPassword(@ModelAttribute("memberChangePassword")MemberChangePassword memberChangePassword,Principal principal,BindingResult result,Model model){
        User user = userService.findOne(principal.getName());
        if(user== null){
            throw new ResourceNotFoundException("Không tìm thấy người dùng");
        }
        Result moResult = validateMember(memberChangePassword, result,user);
        // If has error
        if (result.hasErrors()) {
            errLst = (List<String>) moResult.getResultData();
            return changePasswordInit(memberChangePassword,model,result);
        }
        userService.changePassword(principal.getName(),memberChangePassword.getPasswordNew());
        return "redirect:/";
    }
    private Result validateMember(@Validated MemberChangePassword memberChangePassword, BindingResult bindingResult, User user) {
        Result moResult = new Result();
        if (bindingResult.hasErrors()) {
            List<String> errorMsgs = new ArrayList<>();
            Map<String, String> errsMap = new HashMap<String, String>();
            List<FieldError> errors = bindingResult.getFieldErrors();
            for( FieldError error : errors ) {

                String errorField = error.getField();
                Object[] params = null;

                if (error.getArguments().length > 1) {
                    params = new Object[error.getArguments().length];
                    params[0] = errorField;

                    // Append new parameters to array
                    for( int i = 1; i < error.getArguments().length; i++ ) {
                        params[i] = error.getArguments()[i];
                    }
                } else {
                    params = new Object[] { errorField };
                }

                String errorMsg = error.getDefaultMessage();
                if (!errsMap.containsKey(errorMsg)) {
                    errorMsgs.add(errorMsg);
                    errsMap.put(errorMsg, errorMsg);
                }
            }
            moResult.setResultStatus(false);
            moResult.setResultData(errorMsgs);
            return moResult;
        }
        if (memberChangePassword.getPasswordNew().equals(memberChangePassword.getPassword())) {
            moResult.setResultStatus(false);
            moResult.setResultData("Mật khẩu mới phải khác mật khẩu cũ.");
            return moResult;
        }
        if (!memberChangePassword.getPasswordConfirm().equals(memberChangePassword.getPasswordNew())) {
            moResult.setResultStatus(false);
            moResult.setResultData("Xác nhận mật khẩu không đúng.");
            return moResult;
        }

        Boolean b = passwordEncoder.matches(memberChangePassword.getPassword(), user.getPassword());
        if (!b == true) {
            moResult.setResultStatus(false);
            moResult.setResultData("Mật khẩu cũ không đúng.");
            return moResult;
        }
        moResult.setResultStatus(true);
        return moResult;
    }

}
