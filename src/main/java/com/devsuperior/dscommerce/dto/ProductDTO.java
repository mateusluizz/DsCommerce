package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

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
    @NotEmpty(message = "Must have at least one category")
    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
        for (Category category : entity.getCategories()) {
            categories.add(new CategoryDTO(category));
        }
    }

}
