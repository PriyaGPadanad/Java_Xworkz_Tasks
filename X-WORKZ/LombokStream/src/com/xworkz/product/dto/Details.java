package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Details {

    private String color;
    private String nearBy ;
    private int noOfFloors;
    private String design ;
    private Address address;
}

