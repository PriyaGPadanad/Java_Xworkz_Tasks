package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Registration {
    private String registrationNumber;
    private String ownerName;
    private String vehicleType;
    private String registrationDate;
    private RTO rto;
}

