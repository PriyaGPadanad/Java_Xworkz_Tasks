package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class House {
    private String houseName;
    private String location;
    private String size;
    private int houseNo;
    private Details details;
}

