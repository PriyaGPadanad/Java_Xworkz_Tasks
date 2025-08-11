package com.xworkz.product.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Constituency {

    private String constituencyName;
    private String constituencyState;
    private int totalVoters;
    private String mpSince;
    private Ward ward;
}

