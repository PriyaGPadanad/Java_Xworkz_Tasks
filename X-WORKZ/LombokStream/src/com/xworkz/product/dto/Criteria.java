package com.xworkz.product.dto;


import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Criteria {

    private String criteriaName;
    private String description;
    private boolean isMandatory;
    private int minimumScore;
    private SalaryExpectation salaryExpectation;
}
