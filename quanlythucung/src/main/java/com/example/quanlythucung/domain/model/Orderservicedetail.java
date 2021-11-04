package com.example.quanlythucung.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orderservicedetail")
public class Orderservicedetail {
    @Id
    @Column(name = "ID_OrdSerDe")
    private Integer idOrdSerDe;

    @Column(name = "ID_Pet")
    private Integer idPet;

    @Column(name = "ID_Ser")
    private Integer idSer;

    @Column(name = "startDate")
    private java.sql.Timestamp startDate;

    @Column(name = "endDate")
    private java.sql.Timestamp endDate;

    @Column(name = "unitPrice")
    private float unitPrice;

    @Column(name = "URLImage")
    private String urlImage;

    public Integer getIdOrdSerDe() {
        return this.idOrdSerDe;
    }

    public void setIdOrdSerDe(Integer idOrdSerDe) {
        this.idOrdSerDe = idOrdSerDe;
    }

    public Integer getIdPet() {
        return this.idPet;
    }

    public void setIdPet(Integer idPet) {
        this.idPet = idPet;
    }

    public Integer getIdSer() {
        return this.idSer;
    }

    public void setIdSer(Integer idSer) {
        this.idSer = idSer;
    }

    public java.sql.Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(java.sql.Timestamp startDate) {
        this.startDate = startDate;
    }

    public java.sql.Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(java.sql.Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
