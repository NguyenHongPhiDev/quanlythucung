package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.repository.CategoryRepository;
import com.example.quanlythucung.domain.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Inject
    ProductRepository productRepository;
    @Inject
    CategoryRepository categoryRepository;
    @Override
    public List<Product> getAllProductByCat(Integer id){
        List<Product> list = productRepository.getAllByIdCat(id);
        return list;
    }
    @Override
    public Page<Product> getAllProduct(Pageable pageable){
        return productRepository.findAll(pageable);
    }
    @Override
    public Optional<Product> getOneProduct(int productId){
        return productRepository.findById(productId);
    }
    @Override
    public void add(Product product){
        Categories result = categoryRepository.getOne(product.getIdCat());
        product.setCategories(result);
        productRepository.save(product);
    }
    @Override
    public void update(Product product){
        Categories result = categoryRepository.getOne(product.getIdCat());
        product.setCategories(result);
        productRepository.save(product);
    }
    @Override
    public void remove(Integer id){
        productRepository.deleteById(id);
    }
}
