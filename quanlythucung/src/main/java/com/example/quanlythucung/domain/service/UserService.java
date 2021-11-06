package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface UserService {
    LocalDateTime getLastLoginDate(String username);

    List<User> getAll();

    User findOne(String username);

    void create(User user);

    boolean exists(String username);

    boolean isLocked(String username);

    boolean isInitialPassword(String username);

    void update(User user);
    void changePassword(String username,String password);

    void lockUser(Integer id);

    void unlockUser(Integer id);

    float getBalance(String userName);

    void deductionBalance(String userName, float total);

    void updateBalance(String userName, float price);
}
