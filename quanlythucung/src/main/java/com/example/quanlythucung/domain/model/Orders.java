package com.example.quanlythucung.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Ord")
    private Integer idOrd;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private Integer status;

    @Column(name = "total")
    private float total;

    @Column(name = "date")
    private Timestamp date;

    public Orders() {
    }

    public Orders(String Username, String address, Integer status) {
        this.userName = Username ;
        this.address = address;
        this.status = status;
    }

    public Integer getIdOrd() {
        return this.idOrd;
    }

    public void setIdOrd(Integer idOrd) {
        this.idOrd = idOrd;
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
