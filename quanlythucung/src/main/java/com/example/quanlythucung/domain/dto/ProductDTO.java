package com.example.quanlythucung.domain.dto;

public class ProductDTO {
    private Integer idProd;
    private String prodName;
    private Integer idBrand;
    private Integer idCat;
    private Float price;
    private Integer quantity;
    private java.sql.Timestamp updatedAt;
    private java.sql.Timestamp createdAt;
    private String content;
    private String urlImage;
    private java.sql.Timestamp createdUser;
    private java.sql.Timestamp updatedUser;

    public Integer getIdProd() {
        return this.idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public String getProdName() {
        return this.prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getIdBrand() {
        return this.idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    public Integer getIdCat() {
        return this.idCat;
    }

    public void setIdCat(Integer idCat) {
        this.idCat = idCat;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public java.sql.Timestamp getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(java.sql.Timestamp createdUser) {
        this.createdUser = createdUser;
    }

    public java.sql.Timestamp getUpdatedUser() {
        return this.updatedUser;
    }

    public void setUpdatedUser(java.sql.Timestamp updatedUser) {
        this.updatedUser = updatedUser;
    }
}
