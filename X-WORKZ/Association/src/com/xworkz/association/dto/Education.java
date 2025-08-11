package com.xworkz.association.dto;

import lombok.*;

@EqualsAndHashCode
@Setter
@ToString
@Getter
@AllArgsConstructor

public class Education {
    private String staffName;
    private String qualification;
    private University university;
}
