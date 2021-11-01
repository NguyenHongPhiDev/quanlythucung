package com.example.quanlythucung.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Cat")
    private Integer idCat;

    @Column(name = "catName")
    private String catName;

    public Categories() {
    }

    public Categories(String catName) {
        this.catName = catName;
    }

    public Integer getIdCat() {
        return this.idCat;
    }

    public void setIdCat(Integer idCat) {
        this.idCat = idCat;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
