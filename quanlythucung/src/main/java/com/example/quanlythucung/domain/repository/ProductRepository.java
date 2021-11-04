package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT p from Product p where p.idCat =?1 ")
    List<Product> getAllByIdCat(Integer id);
}
