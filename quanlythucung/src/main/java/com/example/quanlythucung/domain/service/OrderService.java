package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Orders;

import java.sql.Timestamp;
import java.util.List;

public interface OrderService {
    List<Orders> getAll();

    List<Orders> getAllByUser(String user);

    Integer creatOrder(Orders orders);

    void updateStatus(String userName, Integer idOrder, Timestamp date);
}
