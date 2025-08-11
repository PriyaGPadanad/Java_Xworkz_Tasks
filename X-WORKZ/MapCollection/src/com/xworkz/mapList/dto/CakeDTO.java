package com.xworkz.mapList.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@ToString
@EqualsAndHashCode

public class CakeDTO {
    private String name;
    private String flavor;
    private double price;
    private String size;
    private boolean isEggless;
    private String shape;
    private String color;
    private String origin;
    private int layers;
    private int yearIntroduced;

}
