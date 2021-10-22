package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;


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

    @Override
    public void update(User user) {
        User result = userRepository.findUserByUsername(user.getUsername());
        result.setFullName(user.getFullName());
        result.setEmail(user.getEmail());
        result.setBirthDate(user.getBirthDate());
        result.setSex(user.getSex());
        result.setAddress(user.getAddress());
        result.setPhoneNumber(user.getPhoneNumber());
        Date now = new Date();
        Timestamp updateTime = new Timestamp(now.getTime());
        result.setUpdatedAt(updateTime);
        userRepository.save(result);
    }
}
