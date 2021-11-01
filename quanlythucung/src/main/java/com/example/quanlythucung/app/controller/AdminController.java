package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Inject
    CategoryService categoryService;
    @RequestMapping(value = {"/memberList/","memberList"})
    public String memberList(){
        return "admin/memberList";
    }

    //Category
    @RequestMapping(value = {"/category/list/","/category/list"})
    public String categoryList(Model model){
        List<Categories> list = categoryService.getAll();
        model.addAttribute("cateList",list);
        model.addAttribute("js","Admin/category.js");
        return "admin/categoryList";
    }
    @RequestMapping(value = {"/category/add/","/category/add"},method = RequestMethod.POST)
    public String categoryAdd(@ModelAttribute("category")Categories categories){
        categoryService.addCate(categories);
        return "redirect:/admin/category/list";
    }
    @RequestMapping(value = {"/category/update/{idCate}","/category/update/{idCate}/"},method = RequestMethod.GET)
    public String categoryUpdateForm(@PathVariable("idCate") Integer id,Model model){
        Categories result  = categoryService.getOne(id);
        model.addAttribute("item",result);
        return "admin/categoryUpdate";
    }
    @RequestMapping(value = {"/category/update/","/category/update"},method = RequestMethod.POST)
    public String categoryUpdate(@ModelAttribute("category")Categories categories){
        categoryService.UpdateCate(categories);
        return "redirect:/admin/category/list";
    }
    @RequestMapping(value = {"/category/remove/{idCate}","/category/remove/{idCate}/"})
    public String categoryDelete(@PathVariable("idCate") Integer id){
        categoryService.RemoveCate(id);
        return "redirect:/admin/category/list";
    }
}
