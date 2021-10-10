package com.example.quanlythucung.domain.dto;

public class ServiceDTO {
    private Integer idSer;
    private String serviceName;
    private Float servicePrice;

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
