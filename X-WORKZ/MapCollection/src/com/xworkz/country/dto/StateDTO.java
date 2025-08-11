package com.xworkz.country.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor


public class StateDTO {
    private String name;
    private String capital;
    private List<MinisterDTO> ministers;
}
