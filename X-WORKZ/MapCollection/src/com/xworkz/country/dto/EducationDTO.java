package com.xworkz.country.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class EducationDTO {
    private String qualification;
    private int yearOfPassing;
    private UniversityDTO university;
}
