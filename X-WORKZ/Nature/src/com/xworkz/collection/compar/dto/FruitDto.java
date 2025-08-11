package com.xworkz.collection.compar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class FruitDto implements Comparable<FruitDto>{
    private int price;
    private String name;

    @Override
    public int compareTo(FruitDto o) {
        return Integer.compare(o.price, this.price);
    }
}
