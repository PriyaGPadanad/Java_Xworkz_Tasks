package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Vehicle {
    private String vehicleCompany;
    private String vehicleColor;
    private String vehicleModel;
    private int topSpeed;
    private Registration registration;
}

