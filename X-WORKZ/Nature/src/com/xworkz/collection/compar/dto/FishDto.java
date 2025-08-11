package com.xworkz.collection.compar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@ToString

public class FishDto implements Comparable<FishDto> {
    private int price;
    private String fishName;

    @Override
    public int compareTo(FishDto o) {
        return Integer.compare(o.getPrice(), this.getPrice());
    }

}
