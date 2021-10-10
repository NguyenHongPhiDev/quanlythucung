package com.example.quanlythucung.domain.dto;

public class OrderservicedetailDTO {
    private Integer idOrdSerDe;
    private Integer idPet;
    private Integer idSer;
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;
    private Double unitPrice;
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

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
