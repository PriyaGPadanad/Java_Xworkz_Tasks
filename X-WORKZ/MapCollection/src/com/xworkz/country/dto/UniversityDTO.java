package com.xworkz.country.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class UniversityDTO {
    private String name;
    private String location;
    private ChancellorDTO chancellor;
}
