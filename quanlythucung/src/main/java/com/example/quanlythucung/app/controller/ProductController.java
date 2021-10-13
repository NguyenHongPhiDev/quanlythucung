package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/admin/product", method = RequestMethod.GET)
public ModelAndView adminProductPage(){
        ModelAndView mav = new ModelAndView("/admin/product");
        return mav;
    }


}
