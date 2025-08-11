package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class President {
    private String presidentName;
    private int presidentAge;
    private String termStartDate;
    private String previousExperience;
    private Designation designation;
}

