package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u" +
            " join fetch  u.roles ur" +
            " join fetch ur.role " +
            "where u.username=?1")
    User findUserByUsername(String username);

    @Query(value = "select username from User where username=?1")
    User findUser(String username);
    @Transactional
    @Modifying
    @Query(value = "UPDATE User u set u.status = 1 where u.id =?1")
    void lockUser(Integer id);
    @Transactional
    @Modifying
    @Query(value = "update User u set u.status = 0 where u.id =?1")
    int unlockUser(Integer id);
    @Query(value = "select u.balance from User u where u.username=?1")
    float getBalance(String userName);
    @Transactional
    @Modifying
    @Query(value = "update User u set u.balance = u.balance-?2 where u.username =?1")
    void deductionBalance (String userName,float total);
    @Transactional
    @Modifying
    @Query(value = "update User u set u.balance = ?2 where u.username =?1")
    void updateBalance (String userName,float price);
}
