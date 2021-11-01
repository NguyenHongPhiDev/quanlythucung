package com.example.quanlythucung.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "brand")
public class Brand {
    @Id
    @Column(name = "ID_Brand")
    private Integer idBrand;

    @Column(name = "brandName")
    private String brandName;

    public Brand() {
    }

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public Integer getIdBrand() {
        return this.idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
