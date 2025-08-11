package com.xworkz.ProductClass.runner;

import com.xworkz.ProductClass.dto.ProductDTO;

import java.util.*;

public class ProductRunner implements Comparator<ProductDTO> {
    @Override
    public int compare(ProductDTO o1, ProductDTO o2) {
        return 0;
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
