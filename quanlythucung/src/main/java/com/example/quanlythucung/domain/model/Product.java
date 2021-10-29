package com.example.quanlythucung.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "ID_Prod")
    private Integer idProd;

    @Column(name = "prodName")
    private String prodName;

    @Column(name = "ID_Brand")
    private Integer idBrand;

    @Column(name = "ID_Cat",insertable = false,updatable = false)
    private Integer idCat;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "content")
    private String content;

    @Column(name = "URLImage")
    private String urlImage;

    @Column(name = "createdUser")
    private Timestamp createdUser;

    @Column(name = "updatedUser")
    private Timestamp updatedUser;

    public Product() {
    }

    public Product(String prodName, Integer idBrand, Integer idCat, Float price, Integer quantity, Timestamp updatedAt, Timestamp createdAt, String content, String urlImage, Timestamp createdUser, Timestamp updatedUser) {
        this.prodName = prodName;
        this.idBrand = idBrand;
        this.idCat = idCat;
        this.price = price;
        this.quantity = quantity;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.content = content;
        this.urlImage = urlImage;
        this.createdUser = createdUser;
        this.updatedUser = updatedUser;
    }

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

    public Timestamp getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(Timestamp createdUser) {
        this.createdUser = createdUser;
    }

    public Timestamp getUpdatedUser() {
        return this.updatedUser;
    }

    public void setUpdatedUser(Timestamp updatedUser) {
        this.updatedUser = updatedUser;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Cat",referencedColumnName = "ID_Cat")
    private Categories categories;
}
