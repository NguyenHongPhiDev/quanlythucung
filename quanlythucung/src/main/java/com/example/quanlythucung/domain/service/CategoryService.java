package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Categories;

import java.util.List;

public interface CategoryService {
    Categories getOne(Integer id);

    List<Categories> getAll();

    void addCate(Categories category);

    void UpdateCate(Categories category);

    void RemoveCate(Integer id);
}
