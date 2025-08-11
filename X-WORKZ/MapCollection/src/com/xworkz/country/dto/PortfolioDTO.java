package com.xworkz.country.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class PortfolioDTO {
    private String name;
    private String type;
    private DepartmentDTO department;
}
