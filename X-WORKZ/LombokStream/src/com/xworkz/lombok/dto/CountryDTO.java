package com.xworkz.lombok.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
public class CountryDTO {
    private String name;
    private int pinCode;
    private double populationInMillions;
    private int noOfStates;
    private double massInSqKms;
    private String primeMinister;
    private String primaryLang;
    private String secondaryLang;
    private String gdp;
}
