package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.models.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Field must have between 3 and 80 characters")
    @NotBlank(message = "Required Field")
    private String name;
    @Size(min = 10, message = "Description must have minimum 10 characters")
    private String description;
    @Positive(message = "Price must be positive")
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product model) {
        id = model.getId();
        name = model.getName();
        description = model.getDescription();
        price = model.getPrice();
        imgUrl = model.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
