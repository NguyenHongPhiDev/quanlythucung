package com.example.quanlythucung.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "orderservice")
public class Orderservice {
    @Id
    @Column(name = "ID_OrdSer")
    private Integer idOrdSer;

    @Column(name = "ID_OrdSerDe")
    private Integer idOrdSerDe;

    @Column(name = "ID_User")
    private Integer idUser;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "status")
    private Byte status;

    public Orderservice() {
    }

    public Orderservice(Integer idOrdSerDe, Integer idUser, Integer quantity, Byte status) {
        this.idOrdSerDe = idOrdSerDe;
        this.idUser = idUser;
        this.quantity = quantity;
        this.status = status;
    }

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
