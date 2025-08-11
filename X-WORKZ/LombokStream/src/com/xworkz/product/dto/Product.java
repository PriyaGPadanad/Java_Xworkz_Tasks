package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Product {
    private String name;
    private String type;
    private String brand;
    private int price;
    private Company company;
}
