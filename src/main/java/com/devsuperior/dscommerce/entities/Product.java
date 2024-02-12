package com.devsuperior.dscommerce.entities;

import javax.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Double price;
    private String imgUrl;

    @ManyToMany
    @JoinTable(
            name = "tb_product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )

    private final Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "id.product")
    private final Set<OrderItem> items = new HashSet<>();

    public List<Order> getOrder() {
        return items.stream().map(x -> x.getOrder()).toList();
    }
}

