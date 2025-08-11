package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Information {
    private String famousFor;
    private int numberOfTouristPlaces;
    private String localLanguage;
    private boolean hasAirport;
    private Mayor mayor;
}

