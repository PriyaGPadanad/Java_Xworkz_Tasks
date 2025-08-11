package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class PrimeMinister {
    private String PrimeMinisterName;
    private int PrimeMinisterAge;
    private String politicalParty;
    private int termYears;
    private Constituency constituency;
}
