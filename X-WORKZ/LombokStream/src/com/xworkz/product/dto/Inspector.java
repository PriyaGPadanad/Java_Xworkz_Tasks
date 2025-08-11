package com.xworkz.product.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Inspector {
    private String inspectorName;
    private int badgeNumber;
    private String assignedRegion;
    private int yearsOfExperience;
    private List<Experience> experienceList;
}
