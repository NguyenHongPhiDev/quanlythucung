package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {
    @Query("select o from Orders o where o.userName =?1 ")
    List<Orders> getAllOrder(String userName);
    @Transactional
    @Modifying
    @Query("update Orders o set o.status ='1',o.date=?3 where o.userName=?1 and o.idOrd =?2")
    void updateStatus(String username, Integer idOrder, Timestamp timestamp);
    @Query(value = "select count(o) from Orders o where o.userName=?1")
    Integer getQuantityOrder(String userName);
    @Query(value = "select count(o) from Orders o where o.userName=?1 and o.status=1")
    Integer getQuantityOrderStatus1(String userName);
}
