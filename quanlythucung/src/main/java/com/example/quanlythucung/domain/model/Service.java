package com.example.quanlythucung.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @Column(name = "ID_Ser")
    private Integer idSer;

    @Column(name = "serviceName")
    private String serviceName;

    @Column(name = "servicePrice")
    private Float servicePrice;

    public Service() {
    }

    public Service(String serviceName, Float servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public Integer getIdSer() {
        return this.idSer;
    }

    public void setIdSer(Integer idSer) {
        this.idSer = idSer;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Float getServicePrice() {
        return this.servicePrice;
    }

    public void setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
    }
}
