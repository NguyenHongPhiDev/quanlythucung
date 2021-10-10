package com.example.quanlythucung.domain.dto;

public class UserDTO {
    private Integer idUser;
    private String fullName;
    private String email;
    private String userName;
    private String password;
    private java.sql.Date birthDate;
    private Integer sex;
    private String address;
    private Integer phoneNumber;
    private java.sql.Timestamp createdAt;
    private java.sql.Timestamp updatedAt;
    private Byte status;
    private Integer idRole;
    private String token;

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public java.sql.Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(java.sql.Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getIdRole() {
        return this.idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
