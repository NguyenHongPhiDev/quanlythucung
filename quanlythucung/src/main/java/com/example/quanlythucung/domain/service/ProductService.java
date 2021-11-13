package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    List<Product> getAllProductByAllCat(Integer id, Integer id2, Integer id3, Integer id4);

    Page<Product> getAllProduct(Pageable pageable);

    Page<Product> getAllProductByCat(Integer id,Pageable page);

    Optional<Product> getOneProduct(int productId);

    void add(Product product);

    void update(Product product);

    void remove(Integer id);
}
