package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Categories;
import com.example.quanlythucung.domain.repository.CategoryRepository;
import com.example.quanlythucung.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CategoryImpl implements CategoryService{
    @Inject
    CategoryRepository categoryRepository;
    @Inject
    UserRepository userRepository;
    @Override
    public Categories getOne(Integer id){
        return categoryRepository.getOne(id);
    }
    @Override
    public List<Categories> getAll(){
        return categoryRepository.findAll();
    }
    @Override
    public void addCate(Categories category){
        Categories categories = new Categories();
        categories.setCatName(category.getCatName());
        categoryRepository.save(categories);
    }
    @Override
    public void UpdateCate(Categories category){
        Categories categories = categoryRepository.getOne(category.getIdCat());
        categories.setCatName(category.getCatName());
        categoryRepository.save(categories);
    }
    @Override
    public void RemoveCate(Integer id){
        categoryRepository.deleteById(id);
    }

}
