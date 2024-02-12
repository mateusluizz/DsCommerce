package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

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

    public ProductDTO(Product model) {
        id = model.getId();
        name = model.getName();
        description = model.getDescription();
        price = model.getPrice();
        imgUrl = model.getImgUrl();
    }

}
