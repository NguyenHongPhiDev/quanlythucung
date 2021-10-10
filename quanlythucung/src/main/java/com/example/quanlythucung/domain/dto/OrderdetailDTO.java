package com.example.quanlythucung.domain.dto;

public class OrderdetailDTO {
    private Integer idOrdDetail;
    private Integer idProd;
    private Integer idOrd;
    private java.sql.Timestamp updatedAt;
    private java.sql.Timestamp createdAt;
    private Double unitPrice;
    private Integer quantity;

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

    public java.sql.Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(java.sql.Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
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
