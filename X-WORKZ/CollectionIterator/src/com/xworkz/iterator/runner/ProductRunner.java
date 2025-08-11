package com.xworkz.iterator.runner;

import com.xworkz.iterator.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ProductRunner {
    public static void main(String[] args) {
        Collection<ProductDTO> productCollection = new ArrayList<>();

        productCollection.add(new ProductDTO("Smartphone", "Samsung", "Electronics", 30000.0, 10.0, 50, "Black", "2026-01", 12, true));
        productCollection.add(new ProductDTO("Laptop", "HP", "Electronics", 55000.0, 15.0, 25, "Silver", "2026-03", 24, true));
        productCollection.add(new ProductDTO("Refrigerator", "LG", "Home Appliance", 40000.0, 8.0, 30, "White", "2026-07", 36, true));
        productCollection.add(new ProductDTO("Television", "Sony", "Electronics", 60000.0, 12.0, 20, "Black", "2026-12", 18, true));
        productCollection.add(new ProductDTO("Microwave", "IFB", "Appliance", 10000.0, 5.0, 40, "Grey", "2027-01", 12, true));
        productCollection.add(new ProductDTO("AC", "Voltas", "Cooling", 45000.0, 10.0, 15, "White", "2026-04", 24, true));
        productCollection.add(new ProductDTO("Washing Machine", "Whirlpool", "Appliance", 25000.0, 6.0, 10, "Silver", "2026-09", 18, true));
        productCollection.add(new ProductDTO("Mixer", "Preethi", "Kitchen", 6000.0, 7.0, 100, "Red", "2027-02", 12, true));
        productCollection.add(new ProductDTO("Smartwatch", "Boat", "Accessories", 3500.0, 20.0, 70, "Black", "2027-08", 6, true));
        productCollection.add(new ProductDTO("Camera", "Canon", "Gadget", 70000.0, 10.0, 5, "Black", "2026-10", 24, true));

        Iterator<ProductDTO> iterator = productCollection.iterator();
        while(iterator.hasNext()) {
            ProductDTO product = iterator.next();
            System.out.println("product:"+product);
        }
    }
}
