package com.xworkz.product.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

    public class Owner {
    private String name;
    private int age;
    private String email;
    private long phNo;
    private List<House> houseList;
    }


