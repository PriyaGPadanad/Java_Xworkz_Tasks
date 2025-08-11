package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Education {
    private String qualification;
    private String board;
    private int graduationYear;
    private double percentage;
    private University university;
}
