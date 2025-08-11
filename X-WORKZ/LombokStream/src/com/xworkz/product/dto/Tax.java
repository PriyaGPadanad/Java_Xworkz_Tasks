package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Tax {
    private String taxType;
    private double taxAmount;
    private String applicableFor;
    private String financialYear;
    private Government government;
}
