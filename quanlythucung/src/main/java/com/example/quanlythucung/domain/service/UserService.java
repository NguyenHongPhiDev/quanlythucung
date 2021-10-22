package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public interface UserService {
    LocalDateTime getLastLoginDate(String username);

    User findOne(String username);

    void create(User user);

    boolean exists(String username);

    boolean isLocked(String username);

    boolean isInitialPassword(String username);

    void update(User user);
}
