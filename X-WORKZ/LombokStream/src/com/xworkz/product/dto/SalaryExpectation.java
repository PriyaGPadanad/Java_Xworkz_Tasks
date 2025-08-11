package com.xworkz.product.dto;


import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class SalaryExpectation {
    private String candidateName;
    private String desiredRole;
    private double expectedSalary;
    private String currency;
    private Bonus bonus;
}
