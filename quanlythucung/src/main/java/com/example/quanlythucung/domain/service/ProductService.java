package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    Page<Product> getAllProduct(Pageable pageable);

    List<Product> getAllProductByCat(Integer id);

    Optional<Product> getOneProduct(int productId);

    void add(Product product);

    void update(Product product);

    void remove(Integer id);
}
