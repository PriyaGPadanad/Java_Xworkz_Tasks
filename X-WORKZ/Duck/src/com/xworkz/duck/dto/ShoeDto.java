package com.xworkz.duck.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Setter
@Getter

public class ShoeDto {
    private String shoeName;
    private String shoeBrand;
    private int shoePrice;
    private String brandEmail;
    private long brandPhone;
    private LocalDateTime localDateTime;
}
