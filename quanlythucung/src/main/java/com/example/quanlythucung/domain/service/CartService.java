package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.dto.CartItem;

import java.util.Collection;

public interface CartService {
    void add(CartItem item);

    void remove(int productId);

    Collection<CartItem> getItem();

    void update(int productId, int quantity);

    double getAmount();

    int getCount();
}
