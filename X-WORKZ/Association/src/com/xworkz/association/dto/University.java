package com.xworkz.association.dto;

import lombok.*;

@ToString
@Getter
@AllArgsConstructor
@Setter
@EqualsAndHashCode

public class University {
    private String name;
    private String minister;
    private String department;
    private Chancellor chancellor;
}
