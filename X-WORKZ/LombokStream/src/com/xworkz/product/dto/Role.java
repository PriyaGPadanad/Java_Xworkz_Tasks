package com.xworkz.product.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Role {
    private String roleName;
    private String responsibilities;
    private String reportingTo;
    private boolean isLeadershipRole;
    private List<Criteria> criteriaList;
}

