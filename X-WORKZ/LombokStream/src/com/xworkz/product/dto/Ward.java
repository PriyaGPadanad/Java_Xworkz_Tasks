package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Ward {

    private int wardNumber;
    private String wardName;
    private String zone;
    private String city;
}

