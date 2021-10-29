package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.dto.CartItem;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {
    private final Map<Integer,CartItem> map = new HashMap<Integer, CartItem>();

    @Override
    public void add(CartItem item){
        CartItem exitsItem = map.get(item.getIdProd());
        if(exitsItem!= null){
            exitsItem.setQuantity(item.getQuantity()+exitsItem.getQuantity());
        }else {
            map.put(item.getIdProd(),item);
        }
    }
    @Override
    public void remove(int productId){
        map.remove(productId);
    }
    @Override
    public Collection<CartItem> getItem(){
        return map.values();
    }
    @Override
    public  void update(int productId, int quantity){
        CartItem item = map.get(productId);
        item.setQuantity(quantity);
        if(item.getQuantity()<=0){
            map.remove(productId);
        }
    }

    @Override
    public double getAmount(){
        return map.values().stream().mapToDouble(item-> item.getQuantity()* item.getPrice()).sum();
    }
    @Override
    public int getCount(){
        return map.values().size();
    }
}
