package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.service.CategoryService;
import com.example.quanlythucung.domain.service.ProductService;
import com.example.quanlythucung.domain.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    @Inject
    ProductService productService;
    @Inject
    UserService userService;
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
    //Product
    @RequestMapping(value = {"/product/list/","/product/list"})
    public String productList(Model model,@PageableDefault(size = 5) Pageable pageable){
        List<Categories> categories = categoryService.getAll();
        Page<Product> productList = productService.getAllProduct(pageable);
        model.addAttribute("product",productList.getContent());
        model.addAttribute("page", productList);
        model.addAttribute("category",categories);
        model.addAttribute("js","Admin/productAdmin.js");
        return "admin/product";
    }
    @RequestMapping(value = {"/product/add/","/product/add"},method = RequestMethod.POST)
    public String productAdd(@ModelAttribute("product") Product product){
        productService.add(product);
        return "redirect:/admin/product/list";
    }
    @RequestMapping(value = {"/product/update/","/product/update"},method = RequestMethod.POST)
    public String productUpdate(@ModelAttribute("product")Product product){
        productService.update(product);
        return "redirect:/admin/product/list";
    }
    @RequestMapping(value = {"/product/remove/{idPro}","/product/remove/{idPro}/"})
    public String productDelete(@PathVariable("idPro") Integer id){
        productService.remove(id);
        return "redirect:/admin/product/list";
    }
    //Member
    @RequestMapping(value = {"/member/list/","/member/list"})
    public String memberList(Model model){
        List<User> list = userService.getAll();
        model.addAttribute("member",list);
        model.addAttribute("js","Admin/memberList.js");
        return "admin/memberList";
    }
    @RequestMapping(value = {"/member/lock/{id}","/member/lock/{id}/"})
    public String lockMember(@PathVariable("id") Integer id){
        userService.lockUser(id);
        return "redirect:/admin/member/list";
    }
    @RequestMapping(value = {"/member/unlock/{id}","/member/unlock/{id}/"})
    public String unlockMember(@PathVariable("id") Integer id){
        userService.unlockUser(id);
        return "redirect:/admin/member/list";
    }
}
