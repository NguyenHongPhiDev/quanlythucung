package com.example.quanlythucung.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Table(name = "user_role")
public class UserRole implements java.io.Serializable {

    private Integer id;
    private User user;
    private Role role;

    public UserRole() {
    }


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_User")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ROLE")
    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
