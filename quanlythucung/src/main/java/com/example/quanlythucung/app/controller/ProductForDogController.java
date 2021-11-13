package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.repository.ProductRepository;
import com.example.quanlythucung.domain.service.CategoryService;
import com.example.quanlythucung.domain.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    CategoryService categoryService;
    @RequestMapping(value = {"/food/", "/food"})
    public String dogFood(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","dog/thucan.css");
        Page<Product> list = productService.getAllProductByCat(1,pageable);
        model.addAttribute("page", list);
        Categories categories = categoryService.getOne(1);
        model.addAttribute("category",categories.getCatName());
        model.addAttribute("items",list.getContent());
        return "dog/thucan";
    }
    @RequestMapping(value = {"/cage/", "/cage"})
    public String dogCage(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","dog/thucan.css");
        Page<Product> list = productService.getAllProductByCat(4,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(4);
        model.addAttribute("category",categories.getCatName());
        return "dog/chuong";
    }
    @RequestMapping(value = {"/medicine/", "/medicine"})
    public String dogMedicine(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","dog/thucan.css");
        Page<Product> list = productService.getAllProductByCat(3,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(3);
        model.addAttribute("category",categories.getCatName());
        return "dog/thuoc";
    }
    @RequestMapping(value = {"/Item/", "/Item"})
    public String dogItem(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","dog/thucan.css");
        Page<Product> list = productService.getAllProductByCat(7,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(7);
        model.addAttribute("category",categories.getCatName());
        return "dog/vatdunganuong";
    }
    @RequestMapping(value = {"/cleaning-tool/", "/cleaning-tool"})
    public String dogCleaning(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","dog/thucan.css");
        Page<Product> list = productService.getAllProductByCat(10,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(10);
        model.addAttribute("category",categories.getCatName());
        return "dog/vatdung";
    }
    @RequestMapping(value = {"/clothes/", "/clothes"})
    public String dogClothes(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","dog/thucan.css");
        Page<Product> list = productService.getAllProductByCat(2,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(2);
        model.addAttribute("category",categories.getCatName());
        return "dog/quanao";
    }
}