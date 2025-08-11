package com.xworkz.mapList.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Setter

public class SunscreenDTO {
    private String brand;
    private String productName;
    private double price;
    private int spf;
    private boolean isWaterResistant;
    private String skinType;
    private String texture;
    private String origin;
    private int volumeInMl;
    private int yearReleased;


}
