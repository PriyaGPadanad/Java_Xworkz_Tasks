package com.xworkz.product.runner;

import com.xworkz.product.dto.ProductDTO;

import java.util.*;

public class ProductRunner implements Comparator<ProductDTO> {
    @Override
    public int compare(ProductDTO o1, ProductDTO o2) {
        ProductDTO productDTO1 = new ProductDTO(21, "Laptop");
        ProductDTO productDTO2 = new ProductDTO(12, "charger");
        ProductDTO productDTO3 = new ProductDTO(35, "Battery");

        Collection<ProductDTO> productDTOS = new ArrayList<>();
        productDTOS.add(productDTO1);
        productDTOS.add(productDTO2);
        productDTOS.add(productDTO3);

        productDTOS.stream().sorted().forEach(n -> System.out.println(n));
    }
        public static void main(String[] args){
            Comparator<ProductDTO>dtoComparator=((p1,p2)->Integer.compare(p1.getProductId(), p2.getProductId()));

            List<ProductDTO> list=new ArrayList<>();
            list.add(new ProductDTO(12,"Laptop"));
            list.add(new ProductDTO(55,"Charger"));
            list.add(new ProductDTO(21,"Battery"));

            Collections.sort(list,dtoComparator);
            list.forEach(n-> System.out.println(n));

        }
}

