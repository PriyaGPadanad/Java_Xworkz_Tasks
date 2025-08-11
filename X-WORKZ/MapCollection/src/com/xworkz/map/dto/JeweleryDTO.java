package com.xworkz.map.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@ToString
public class JeweleryDTO implements Serializable {
    private  String jewwelMaterial;
    private String jewelType;
    private int price;
    private String shopNmae;
    private  String carat;
}
