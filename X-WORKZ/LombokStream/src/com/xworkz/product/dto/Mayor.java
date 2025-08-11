package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Mayor {
    private String name;
    private int yearsInOffice;
    private String politicalParty;
    private String cityName;
    private Vehicle vehical;
}

