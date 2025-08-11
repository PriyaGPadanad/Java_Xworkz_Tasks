package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Experience {
    private String field;
    private int years;
    private String organizationName;
    private String role;
    private Education education;
}

