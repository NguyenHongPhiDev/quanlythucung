package com.example.quanlythucung.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cat")
public class ProductForCatController {

    @RequestMapping(value = {"/food/", "/food"})
    public String catFood(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/thucan";
    }
    @RequestMapping(value = {"/cage/", "/cage"})
    public String catCage(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/chuong";
    }
    @RequestMapping(value = {"/medicine/", "/medicine"})
    public String catMedicine(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/thuoc";
    }
    @RequestMapping(value = {"/Item/", "/Item"})
    public String catItem(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/vatdunganuong";
    }
    @RequestMapping(value = {"/cleaning-tool/", "/cleaning-tool"})
    public String catCleaning(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/vatdung";
    }
    @RequestMapping(value = {"/clothes/", "/clothes"})
    public String catClothes(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/quanao";
    }
    @RequestMapping(value = {"/sand/", "/sand"})
    public String catSand(Model model) {
        model.addAttribute("styleSheet","cat/thucan.css");
        return "cat/cat";
    }
}