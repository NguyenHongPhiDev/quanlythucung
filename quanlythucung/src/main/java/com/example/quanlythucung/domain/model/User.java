package com.example.quanlythucung.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "USERNAME"))
public class User implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID_User", unique = true, nullable = false)
    public Integer id;

    @Column(name = "USERNAME", unique = true, length = 50)
    public String username;
    @Column(name = "PASSWORD", length = 50)
    public String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserRole> roles = new HashSet<>();
    public User() {
    }
}
