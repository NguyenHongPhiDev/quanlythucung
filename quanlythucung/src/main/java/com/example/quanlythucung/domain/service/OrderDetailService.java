package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Orderdetail;
import com.example.quanlythucung.domain.model.Orders;

import java.util.List;

public interface OrderDetailService {
    List<Orderdetail> getAll();
    void createOrderDetail(Integer proId, Integer idOrder, Float price, Integer quantity);

    List<Orderdetail> getAllByOrderId(Integer id);
}
