package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CategoryImpl implements CategoryService{
    @Inject
    CategoryRepository categoryRepository;
    @Override
    public List<Categories> getAll(){
        return categoryRepository.findAll();
    }
}
