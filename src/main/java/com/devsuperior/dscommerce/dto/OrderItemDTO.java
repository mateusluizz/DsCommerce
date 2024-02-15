package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class OrderItemDTO {

    private Long productID;
    private String name;
    private Double price;
    private Integer quanity;

    public OrderItemDTO(OrderItem entity) {
        productID = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quanity = entity.getQuantity();
    }

    public Double getSubTotal(){
        return price * quanity;
    }
}
