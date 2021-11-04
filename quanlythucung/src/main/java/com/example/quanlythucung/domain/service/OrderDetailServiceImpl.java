package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.Orderdetail;
import com.example.quanlythucung.domain.model.Product;
import com.example.quanlythucung.domain.repository.OrderDetailRepository;
import com.example.quanlythucung.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Inject
    OrderDetailRepository orderDetailRepository;
    @Inject
    ProductRepository productRepository;
    @Override
    public List<Orderdetail> getAll(){
        return orderDetailRepository.findAll();
    }
    @Override
    public void createOrderDetail(Integer proId, Integer idOrder, Float price, Integer quantity){
        Orderdetail orderdetail = new Orderdetail();
        orderdetail.setIdProd(proId);
        orderdetail.setIdOrd(idOrder);
        orderdetail.setUnitPrice(price);
        orderdetail.setQuantity(quantity);
        Product product = productRepository.getOne(proId);
        orderdetail.setProduct(product);
        orderDetailRepository.save(orderdetail);
    }
    @Override
    public List<Orderdetail> getAllByOrderId(Integer id){
        return orderDetailRepository.getOrderDetail(id);
    }
}
