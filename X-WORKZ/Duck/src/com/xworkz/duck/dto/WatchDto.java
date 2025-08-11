package com.xworkz.duck.dto;

import lombok.*;

import java.time.LocalDateTime;


@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor

public class WatchDto {
    private String model;
    private String brand;
    private int price;
    private String email;
    private long phone;
    private LocalDateTime date;
}
