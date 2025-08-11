package com.xworkz.product.dto;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

public class RTO {

    private String rtoCode;
    private String rtoLocation;
    private String officerInCharge;
    private int numberOfEmployees;
    private Inspector inspector;

}