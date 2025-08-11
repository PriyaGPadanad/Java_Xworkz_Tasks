package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Government {
    private String governmentType;
    private String country;
    private String headOfGovernment;
    private int numberOfMinistries;
    private PrimeMinister primeMinister;
}

