package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;
    @Override
    public LocalDateTime getLastLoginDate(String username) {
        return null;
    }

    @Override
    public User findOne(String username) {
        return  userRepository.findUserByUsername(username);
    }

    @Override
    public void create(User user) {
    }

    @Override
    public boolean exists(String username) {
        return false;
    }

    @Override
    public boolean isLocked(String username) {
        return false;
    }

    @Override
    public boolean isInitialPassword(String username) {
        return false;
    }
}
