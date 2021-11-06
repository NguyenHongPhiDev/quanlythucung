package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.common.exception.BadRequestException;
import com.example.quanlythucung.domain.dto.CartItem;
import com.example.quanlythucung.domain.model.Orders;
import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.security.Principal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Inject
    ProductService productService;
    @Inject
    CartService  cartService;
    @Inject
    OrderService orderService;
    @Inject
    OrderDetailService orderDetailService;
    @Inject
    UserService userService;
    @RequestMapping(value = {"","/"})
    public String cartInit(Model model){
        Collection<CartItem> cartItems = cartService.getItem();
        model.addAttribute("cartItems",cartItems);
        model.addAttribute("total",cartService.getAmount());
        model.addAttribute("quantity",cartService.getCount());
        return "cart/list";
    }
    @RequestMapping(value = {"/pay/","/pay"})
    public String cartPay(Model model, Principal principal){
        if(principal==null){
            return "login/login";
        }
        Orders orders = new Orders();
        orders.setUserName(principal.getName());
        orders.setStatus(0);
        orders.setTotal((float) cartService.getAmount());
        Integer orderId = orderService.creatOrder(orders);
        Collection<CartItem> cartItems = cartService.getItem();
        for (CartItem product : cartItems){
            orderDetailService.createOrderDetail(product.getIdProd(),orderId,product.getPrice(),product.getQuantity());
        }
        Date date = new Date();
        float balance = userService.getBalance(principal.getName());
        if(balance<cartService.getAmount()){
            throw new BadRequestException(" enough balance!!!");
        }
        orderService.updateStatus(principal.getName(),orderId,new Timestamp(date.getTime()));
        userService.deductionBalance(principal.getName(), (float) cartService.getAmount());
        return "cart/succes";
    }
    @RequestMapping(value = {"/add/{productId}/","/add/{productId}"})
    @ResponseBody
    public String addItem(@PathVariable("productId") int productId, Model model){
        Optional<Product> item = productService.getOneProduct(productId);
        if(item != null){
            item.get().setQuantity(1);
            CartItem cartItem = new CartItem();
            BeanUtils.copyProperties(item.get(),cartItem);
            cartItem.setQuantity(1);
            cartService.add(cartItem);
        }
        return "Add product success!";
    }
    @RequestMapping(value = {"/update/","/update"})
    public String updateCart(@ModelAttribute("cartItem") CartItem cartItem,Model model){
        cartService.update(cartItem.getIdProd(),cartItem.getQuantity());
        return "redirect:/cart";
    }
    @RequestMapping(value = {"/remove/{productId}/","/remove/{productId}"})
    public String removeCart(@PathVariable("productId") int productId){
        cartService.remove(productId);
        return "redirect:/cart";
    }
}
