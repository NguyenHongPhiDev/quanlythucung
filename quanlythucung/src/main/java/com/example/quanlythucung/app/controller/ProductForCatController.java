package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/cat")
public class ProductForCatController {
    @Inject
    ProductService productService;
    @RequestMapping(value = {"/food/", "/food"})
    public String catFood(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(5);
        model.addAttribute("items",list);
        return "cat/thucan";
    }
    @RequestMapping(value = {"/cage/", "/cage"})
    public String catCage(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(6);
        model.addAttribute("items",list);
        return "cat/chuong";
    }
    @RequestMapping(value = {"/medicine/", "/medicine"})
    public String catMedicine(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(13);
        model.addAttribute("items",list);
        return "cat/thuoc";
    }
    @RequestMapping(value = {"/Item/", "/Item"})
    public String catItem(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(15);
        model.addAttribute("items",list);
        return "cat/vatdunganuong";
    }
    @RequestMapping(value = {"/cleaning-tool/", "/cleaning-tool"})
    public String catCleaning(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(14);
        model.addAttribute("items",list);
        return "cat/vatdung";
    }
    @RequestMapping(value = {"/clothes/", "/clothes"})
    public String catClothes(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(12);
        model.addAttribute("items",list);
        return "cat/quanao";
    }
    @RequestMapping(value = {"/sand/", "/sand"})
    public String catSand(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        List<Product> list = productService.getAllProductByCat(11);
        model.addAttribute("items",list);
        return "cat/cat";
    }
}