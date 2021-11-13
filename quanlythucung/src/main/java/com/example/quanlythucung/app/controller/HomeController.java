package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
public class HomeController {
    @Inject
    ProductService productService;
    @RequestMapping(value = {"/","/index"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model,@PageableDefault(size = 20) Pageable pageable) {
        model.addAttribute("styleSheet","web/index.css");
        Page<Product> list = productService.getAllProduct(pageable);
        model.addAttribute("items",list.getContent());
        List<Product> listMoi = productService.getAllProductByAllCat(10,6,7,8);
        List<Product> listCho = productService.getAllProductByAllCat(4,3,2,1);
        List<Product> listMeo = productService.getAllProductByAllCat(15,14,13,12);
        model.addAttribute("items1",listMoi);
        model.addAttribute("items2",listCho);
        model.addAttribute("items3",listMeo);
        return "web/index";
    }
}
