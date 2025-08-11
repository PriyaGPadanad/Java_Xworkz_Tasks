package com.xworkz.collection.compar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
@Getter

public class FlowerDto implements Comparable<FlowerDto>{
private int price;
private String name;

    @Override
    public int compareTo(FlowerDto o) {
        return Integer.compare(this.price,o.price);

    }
}
