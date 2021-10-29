package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Inject
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct(){
        List<Product> list = productRepository.findAll();
        return list;
    }
    @Override
    public Optional<Product> getOneProduct(int productId){
        return productRepository.findById(productId);
    }
}
