package com.example.quanlythucung.domain.dto;

public class OrderserviceDTO {
    private Integer idOrdSer;
    private Integer idOrdSerDe;
    private Integer idUser;
    private Integer quantity;
    private Byte status;

    public Integer getIdOrdSer() {
        return this.idOrdSer;
    }

    public void setIdOrdSer(Integer idOrdSer) {
        this.idOrdSer = idOrdSer;
    }

    public Integer getIdOrdSerDe() {
        return this.idOrdSerDe;
    }

    public void setIdOrdSerDe(Integer idOrdSerDe) {
        this.idOrdSerDe = idOrdSerDe;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
