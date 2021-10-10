package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u" +
            " join fetch  u.roles ur" +
            " join fetch ur.role " +
            "where u.username=?1")
    User findUserByUsername(String username);
}
