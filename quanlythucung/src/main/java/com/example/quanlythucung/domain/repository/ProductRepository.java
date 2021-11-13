package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT p from Product p where p.idCat =?1 ")
    Page<Product> getAllByIdCat(Integer id, Pageable page);
    @Query(value = "SELECT p from Product p where p.idCat =?1 or p.idCat=?2 or p.idCat=?3 or p.idCat=?4 ")
    List<Product> getAllByIdCat(Integer id,Integer id1,Integer id2,Integer id3);
}
