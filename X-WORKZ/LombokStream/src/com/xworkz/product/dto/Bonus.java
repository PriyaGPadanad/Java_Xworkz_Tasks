package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Bonus {
    private String bonusType;
    private double amount;
    private String eligibleRole;
    private String issuedDate;
    private Tax tax;
}

