package com.example.quanlythucung.domain.repository;

import com.example.quanlythucung.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query
    Role findRoleByRoleName(String name);
}
