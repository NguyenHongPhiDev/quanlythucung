package com.example.quanlythucung.domain.service;

import com.example.quanlythucung.domain.common.exception.BadRequestException;
import com.example.quanlythucung.domain.model.Role;
import com.example.quanlythucung.domain.model.User;
import com.example.quanlythucung.domain.model.UserRole;
import com.example.quanlythucung.domain.repository.RoleRepository;
import com.example.quanlythucung.domain.repository.UserRepository;
import com.example.quanlythucung.domain.repository.UserRoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;
    @Inject
    PasswordEncoder passwordEncoder;
    @Inject
    RoleRepository roleRepository;
    @Inject
    UserRoleRepository userRoleRepository;
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
        User result = userRepository.findUserByUsername(user.getUsername());
        if (result != null) {
            throw new BadRequestException("User exit early!!");
        }
        User user1 = new User();
        user1.setUsername(user.getUsername());
        //encode password
        String password1 = passwordEncoder.encode(user.getPassword());
        user1.setPassword(password1);
        UserRole userRole = new UserRole();
        Role role = roleRepository.findRoleByRoleName("ROLE_USER");
        userRole.setUser(user1);
        userRole.setRole(role);
        userRepository.save(user1);
        userRoleRepository.save(userRole);
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

    @Override
    public void changePassword(String username,String password) {
        User result = userRepository.findUserByUsername(username);
        result.setPassword(passwordEncoder.encode(password));
        userRepository.save(result);
    }
}
