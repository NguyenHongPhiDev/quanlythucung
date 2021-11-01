package com.example.quanlythucung.domain.dto;

import com.example.quanlythucung.domain.model.Categories;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private Integer idProd;

    private String prodName;

    private Integer idBrand;

    private Integer idCat;

    private Float price;

    private Integer quantity;

    private Timestamp updatedAt;

    private Timestamp createdAt;

    private String content;

    private String urlImage;

    private Timestamp createdUser;

    private Timestamp updatedUser;
    private Categories categories;
}
