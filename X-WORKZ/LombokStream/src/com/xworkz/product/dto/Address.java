package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter


public class Address {
    private String place;
    private int pincode;
    private String State;
    private String country;
    private City city;
}
