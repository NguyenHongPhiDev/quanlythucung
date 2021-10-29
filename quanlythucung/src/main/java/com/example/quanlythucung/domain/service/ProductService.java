package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    List<Product> getAllProduct();

    Optional<Product> getOneProduct(int productId);
}
