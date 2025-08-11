package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class University {
    private String universityName;
    private String universityLocation;
    private int UniversityEstablishedYear;
    private int numberOfStudents;
    private President president;
}

