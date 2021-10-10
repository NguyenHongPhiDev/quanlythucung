package com.example.quanlythucung.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "ID_Ord")
    private Integer idOrd;

    @Column(name = "ID_User")
    private Integer idUser;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private Integer status;

    public Orders() {
    }

    public Orders(Integer idUser, String address, Integer status) {
        this.idUser = idUser;
        this.address = address;
        this.status = status;
    }

    public Integer getIdOrd() {
        return this.idOrd;
    }

    public void setIdOrd(Integer idOrd) {
        this.idOrd = idOrd;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
