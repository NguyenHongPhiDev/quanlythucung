package com.example.quanlythucung.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
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
    private Integer id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "USERNAME", unique = true, length = 50)
    private String username;
    @Column(name = "PASSWORD", length = 50)
    private String password;
    @Column(name = "birthDate")
    private String birthDate;
    @Column(name = "sex")
    private String sex;
    @Column(name = "address")
    private String address;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @Column(name = "URLImage")
    private String urlImage;



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserRole> roles = new HashSet<>();
    public User() {
    }
}
