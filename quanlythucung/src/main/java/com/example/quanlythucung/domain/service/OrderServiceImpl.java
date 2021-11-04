package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Orders;
import com.example.quanlythucung.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Inject
    OrderRepository orderRepository;
    @Override
    public List<Orders> getAll(){
        return orderRepository.findAll();
    }
    @Override
    public List<Orders> getAllByUser(String user){
        return orderRepository.getAllOrder(user);
    }
    @Override
    public Integer creatOrder(Orders orders){
        orderRepository.save(orders);
        return orders.getIdOrd();
    }
    @Override
    public void updateStatus(String userName, Integer idOrder, Timestamp date){
        orderRepository.updateStatus(userName,idOrder,date);
    }
}
