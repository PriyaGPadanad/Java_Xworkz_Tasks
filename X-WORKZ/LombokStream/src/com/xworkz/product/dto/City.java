package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter
public class City {
    private String cityName;
    private String cityState;
    private double areaInSqKm;
    private int population;
    private Information information;

}

