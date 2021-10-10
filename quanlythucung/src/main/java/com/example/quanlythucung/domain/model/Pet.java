package com.example.quanlythucung.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @Column(name = "ID_Pet")
    private Integer idPet;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "URLImage")
    private String urlImage;

    public Pet() {
    }

    public Pet(String name, String species, Float weight, Integer sex, String urlImage) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.sex = sex;
        this.urlImage = urlImage;
    }

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
