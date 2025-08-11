package com.xworkz.country.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class DetailDTO {
    private String name;
    private int age;
    private EducationDTO education;
}
