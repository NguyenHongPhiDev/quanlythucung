package com.example.quanlythucung.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orderdetail")
public class Orderdetail {
    @Id
    @Column(name = "ID_OrdDetail")
    private Integer idOrdDetail;

    @Column(name = "ID_Prod")
    private Integer idProd;

    @Column(name = "ID_Ord")
    private Integer idOrd;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "unitPrice")
    private Double unitPrice;

    @Column(name = "quantity")
    private Integer quantity;

    public Orderdetail() {
    }

    public Orderdetail(Integer idProd, Integer idOrd, Timestamp updatedAt, Timestamp createdAt, Double unitPrice, Integer quantity) {
        this.idProd = idProd;
        this.idOrd = idOrd;
        this.updatedAt = updatedAt;
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

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
