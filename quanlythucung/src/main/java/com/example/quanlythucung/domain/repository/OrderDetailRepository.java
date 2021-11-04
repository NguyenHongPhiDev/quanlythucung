package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.Orderdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<Orderdetail,Integer> {
    @Query(value = "SELECT od from Orderdetail od where od.idOrd =?1")
    List<Orderdetail> getOrderDetail(Integer id);
}
