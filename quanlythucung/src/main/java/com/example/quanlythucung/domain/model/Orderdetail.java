package com.example.quanlythucung.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
@Table(name = "orderdetail")
public class Orderdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OrdDetail")
    private Integer idOrdDetail;

    @Column(name = "ID_Prod",insertable = false,updatable = false)
    private Integer idProd;

    @Column(name = "ID_Ord")
    private Integer idOrd;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "unitPrice")
    private Float unitPrice;

    @Column(name = "quantity")
    private Integer quantity;

    public Orderdetail() {
    }

    public Orderdetail(Integer idProd, Integer idOrd, Timestamp createdAt, Float unitPrice, Integer quantity) {
        this.idProd = idProd;
        this.idOrd = idOrd;
        this.createdAt = createdAt;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Integer getIdOrdDetail() {
        return this.idOrdDetail;
    }

    public void setIdOrdDetail(Integer idOrdDetail) {
        this.idOrdDetail = idOrdDetail;
    }

    public Integer getIdProd() {
        return this.idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public Integer getIdOrd() {
        return this.idOrd;
    }

    public void setIdOrd(Integer idOrd) {
        this.idOrd = idOrd;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    @OneToOne
    @JoinColumn(name = "ID_Prod")
    private Product product;
}
