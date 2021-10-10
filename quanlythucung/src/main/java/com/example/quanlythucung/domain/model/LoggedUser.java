package com.example.quanlythucung.domain.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LoggedUser implements UserDetails {

    private User user;
    private List<String> roles;

    public LoggedUser(User user, List<String> roles) {
        this.user = user;
        this.roles = roles;
    }


    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

    public String getPassword() {
        return user.getPassword();
    }

    public String getUsername() {
        return user.getUsername();
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

}
