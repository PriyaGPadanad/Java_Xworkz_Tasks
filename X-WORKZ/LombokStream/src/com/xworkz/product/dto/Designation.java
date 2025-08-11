package com.xworkz.product.dto;


import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Designation {
    private String title;
    private String department;
    private String level;
    private double salary;
    private Role Role;
}
