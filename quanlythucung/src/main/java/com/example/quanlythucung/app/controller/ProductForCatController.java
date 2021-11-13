package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.model.Product;
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
@RequestMapping("/cat")
public class ProductForCatController {
    @Inject
    ProductService productService;
    @Inject
    CategoryService  categoryService;
    @RequestMapping(value = {"/food/", "/food"})
    public String catFood(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(5,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(5);
        model.addAttribute("category",categories.getCatName());
        return "cat/thucan";
    }
    @RequestMapping(value = {"/cage/", "/cage"})
    public String catCage(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(6,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(6);
        model.addAttribute("category",categories.getCatName());
        return "cat/chuong";
    }
    @RequestMapping(value = {"/medicine/", "/medicine"})
    public String catMedicine(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(13,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(13);
        model.addAttribute("category",categories.getCatName());
        return "cat/thuoc";
    }
    @RequestMapping(value = {"/Item/", "/Item"})
    public String catItem(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(15,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(15);
        model.addAttribute("category",categories.getCatName());
        return "cat/vatdunganuong";
    }
    @RequestMapping(value = {"/cleaning-tool/", "/cleaning-tool"})
    public String catCleaning(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(14,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(14);
        model.addAttribute("category",categories.getCatName());
        return "cat/vatdung";
    }
    @RequestMapping(value = {"/clothes/", "/clothes"})
    public String catClothes(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(12,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(12);
        model.addAttribute("category",categories.getCatName());
        return "cat/quanao";
    }
    @RequestMapping(value = {"/sand/", "/sand"})
    public String catSand(Model model,@PageableDefault(size = 8) Pageable pageable) {
        model.addAttribute("styleSheet","cat/thucan.css");
        Page<Product> list = productService.getAllProductByCat(11,pageable);
        model.addAttribute("page", list);
        model.addAttribute("items",list.getContent());
        Categories categories = categoryService.getOne(11);
        model.addAttribute("category",categories.getCatName());
        return "cat/cat";
    }
}