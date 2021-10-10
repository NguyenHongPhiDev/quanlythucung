package com.example.quanlythucung.domain.dto;

public class OrdersDTO {
    private Integer idOrd;
    private Integer idUser;
    private String address;
    private Integer status;

    public Integer getIdOrd() {
        return this.idOrd;
    }

    public void setIdOrd(Integer idOrd) {
        this.idOrd = idOrd;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
