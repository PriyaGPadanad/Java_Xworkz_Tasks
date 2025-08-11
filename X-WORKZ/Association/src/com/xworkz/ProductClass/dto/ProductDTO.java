package com.xworkz.ProductClass.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@Setter
@EqualsAndHashCode

public class ProductDTO implements Comparable<ProductDTO>{
    private int ProductId;
    private String ProductName;


@Override
public int compareTo(ProductDTO dto) {
    if (dto.getProductId() > this.getProductId()) {
        return 1;
    } else if (dto.getProductId() == this.getProductId()) {
        return 0;
    } else {
        return -1;
    }
 }
}
