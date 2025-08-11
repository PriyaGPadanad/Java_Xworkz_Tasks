package com.xworkz.country.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class StaffDTO {
    private String name;
    private String role;
    private DetailDTO detail;
}
