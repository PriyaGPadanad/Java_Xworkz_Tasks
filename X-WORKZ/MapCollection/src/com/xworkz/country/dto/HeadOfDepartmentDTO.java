package com.xworkz.country.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class HeadOfDepartmentDTO {
    private String name;
    private int experience;
    private List<StaffDTO> staffList;
}
