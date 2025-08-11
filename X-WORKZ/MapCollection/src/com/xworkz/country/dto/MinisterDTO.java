package com.xworkz.country.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class MinisterDTO {
    private String name;
    private int age;
    private List<PortfolioDTO> portfolios;
}
