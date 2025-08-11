package com.xworkz.duck.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
@Setter
@Getter
@EqualsAndHashCode

public class PenDto {
    private String type;
    private String brand;
    private int cost;
    private String email;
    private long phone;
    private LocalDateTime date;
}
