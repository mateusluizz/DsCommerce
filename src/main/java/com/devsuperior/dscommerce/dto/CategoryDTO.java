package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CategoryDTO {

    private Long id;
    private String name;

    CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

}
