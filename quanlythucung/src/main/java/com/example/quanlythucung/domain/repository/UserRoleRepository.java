package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}
