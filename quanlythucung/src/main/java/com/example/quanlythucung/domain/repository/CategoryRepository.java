package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories,Integer> {
}
