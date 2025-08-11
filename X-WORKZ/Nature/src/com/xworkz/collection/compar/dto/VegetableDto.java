package com.xworkz.collection.compar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@ToString
@Setter
@Getter
public class VegetableDto implements Comparable<VegetableDto> {
    private int price;
    private String name;

    @Override
    public int compareTo(VegetableDto o) {
        return Integer.compare(this.price, o.price);
    }
}

