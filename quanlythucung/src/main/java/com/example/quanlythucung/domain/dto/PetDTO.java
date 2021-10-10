package com.example.quanlythucung.domain.dto;

public class PetDTO {
    private Integer idPet;
    private String name;
    private String species;
    private Float weight;
    private Integer sex;
    private String urlImage;

    public Integer getIdPet() {
        return this.idPet;
    }

    public void setIdPet(Integer idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Float getWeight() {
        return this.weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
