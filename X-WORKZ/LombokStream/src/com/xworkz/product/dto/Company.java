package com.xworkz.product.dto;

import lombok.*;

import java.security.acl.Owner;
import java.util.List;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Company {
    private String name;
    private String location;
    private String country;
    private String founder;
    private List<Owner> ownerList;
}

