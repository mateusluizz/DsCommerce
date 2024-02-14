package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor

public class ProductMinDTO {

    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    public ProductMinDTO(Product model) {
        id = model.getId();
        name = model.getName();
        price = model.getPrice();
        imgUrl = model.getImgUrl();
    }

}
