package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.repository.ProductRepository;
import com.example.quanlythucung.domain.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/dog")
public class ProductForDogController {
    @Inject
    ProductService productService;
    @Inject
    ProductRepository productRepository;
    @RequestMapping(value = {"/food/", "/food"})
    public String dogFood(Model model) {
        model.addAttribute("styleSheet","dog/thucan.css");
        List<Product> list = productService.getAllProductByCat(1);
        model.addAttribute("items",list);
        return "dog/thucan";
    }
    @RequestMapping(value = {"/cage/", "/cage"})
    public String dogCage(Model model) {
        model.addAttribute("styleSheet","dog/thucan.css");
        List<Product> list = productService.getAllProductByCat(4);
        model.addAttribute("items",list);
        return "dog/chuong";
    }
    @RequestMapping(value = {"/medicine/", "/medicine"})
    public String dogMedicine(Model model) {
        model.addAttribute("styleSheet","dog/thucan.css");
        List<Product> list = productService.getAllProductByCat(3);
        model.addAttribute("items",list);
        return "dog/thuoc";
    }
    @RequestMapping(value = {"/Item/", "/Item"})
    public String dogItem(Model model) {
        model.addAttribute("styleSheet","dog/thucan.css");
        List<Product> list = productService.getAllProductByCat(7);
        model.addAttribute("items",list);
        return "dog/vatdunganuong";
    }
    @RequestMapping(value = {"/cleaning-tool/", "/cleaning-tool"})
    public String dogCleaning(Model model) {
        model.addAttribute("styleSheet","dog/thucan.css");
        List<Product> list = productService.getAllProductByCat(10);
        model.addAttribute("items",list);
        return "dog/vatdung";
    }
    @RequestMapping(value = {"/clothes/", "/clothes"})
    public String dogClothes(Model model) {
        model.addAttribute("styleSheet","dog/thucan.css");
        List<Product> list = productService.getAllProductByCat(2);
        model.addAttribute("items",list);
        return "dog/quanao";
    }
}