package com.xworkz.country.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class DepartmentDTO {
    private String name;
    private HeadOfDepartmentDTO headOfDepartment;
}
