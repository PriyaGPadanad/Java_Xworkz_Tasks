package com.xworkz.mapList.dto;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class DollDTO {
    private String name;
    private String brand;
    private double price;
    private String material;
    private String color;
    private boolean isCollectible;
    private String origin;
    private int recommendedAge;
    private int year;
    private String type;
}
