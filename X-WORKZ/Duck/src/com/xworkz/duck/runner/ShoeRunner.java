package com.xworkz.duck.runner;

import com.xworkz.duck.dto.ShoeDto;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ShoeRunner {
    public static void main(String[] args) {
        Comparator<ShoeDto> priceComparator = (o1, o2) -> Integer.compare(o1.getShoePrice(), o2.getShoePrice());
        Comparator<ShoeDto> priceAsc = Comparator.comparingInt(ShoeDto::getShoePrice);
        Comparator<ShoeDto> priceDesc = (o1, o2) -> Integer.compare(o2.getShoePrice(), o1.getShoePrice());
        Comparator<ShoeDto> brandComparator = Comparator.comparing(ShoeDto::getShoeBrand);
        Comparator<ShoeDto> nameEmailComparator = Comparator.comparing(ShoeDto::getShoeName).thenComparing(ShoeDto::getBrandEmail);
        Comparator<ShoeDto> phoneNameComparator = Comparator.comparing(ShoeDto::getBrandPhone).thenComparing(ShoeDto::getShoeName);
        Comparator<ShoeDto> dateComparator = Comparator.comparing(ShoeDto::getLocalDateTime);
        Comparator<ShoeDto> domainComparator = Comparator.comparing(ShoeDto::getBrandEmail);

        List<ShoeDto> shoes = Stream.of(
                new ShoeDto("AirMax", "Nike", 5999, "nike@brand.com", 9000011122L, LocalDateTime.now()),
                new ShoeDto("Ultraboost", "Adidas", 7999, "adidas@brand.com", 9123456780L, LocalDateTime.now()),
                new ShoeDto("Classic Leather", "Reebok", 4999, "care@reebok.com", 9334455661L, LocalDateTime.now()),
                new ShoeDto("Gel-Kayano", "ASICS", 8999, "info@asics.com", 9400112233L, LocalDateTime.now()),
                new ShoeDto("ZoomFly", "Nike", 6599, "nikehelp@brand.com", 9500112233L, LocalDateTime.now()),
                new ShoeDto("Wave Inspire", "Mizuno", 9999, "mizuno@brand.com", 9112233445L, LocalDateTime.now()),
                new ShoeDto("Gel-Excite", "ASICS", 5599, "asicscare@brand.com", 9678990123L, LocalDateTime.now()),
                new ShoeDto("Revolution", "Nike", 4299, "nikecare@brand.com", 9780011223L, LocalDateTime.now()),
                new ShoeDto("SolarGlide", "Adidas", 8999, "adidashelp@brand.com", 9001234567L, LocalDateTime.now()),
                new ShoeDto("Trail Blazer", "Puma", 6999, "puma@brand.com", 9911003344L, LocalDateTime.now()),
                new ShoeDto("Slip-On", "Vans", 2999, "care@vans.com", 9110011223L, LocalDateTime.now()),
                new ShoeDto("Old Skool", "Vans", 4599, "support@vans.com", 9334455677L, LocalDateTime.now()),
                new ShoeDto("Chuck Taylor", "Converse", 3599, "converse@brand.com", 9123445566L, LocalDateTime.now()),
                new ShoeDto("AlphaBounce", "Adidas", 7899, "adidasservice@brand.com", 9223344556L, LocalDateTime.now()),
                new ShoeDto("X9000L4", "Adidas", 8499, "adidasquery@brand.com", 9102345678L, LocalDateTime.now()),
                new ShoeDto("Metcon", "Nike", 6999, "help@nike.com", 9055567788L, LocalDateTime.now()),
                new ShoeDto("Clifton", "Hoka", 10999, "info@hoka.com", 9345678990L, LocalDateTime.now()),
                new ShoeDto("FuelCell", "New Balance", 7599, "nb@brand.com", 9223344559L, LocalDateTime.now()),
                new ShoeDto("Infinity React", "Nike", 8499, "care@nikebrand.com", 9155567890L, LocalDateTime.now()),
                new ShoeDto("Speedgoat", "Hoka", 10299, "hoka@brand.com", 9109876543L, LocalDateTime.now())
        ).collect(Collectors.toList());

        out.println("1.Sort By Integer:");
        shoes.stream().sorted(priceComparator).forEach(out::println);

        out.println("\n2. Ascending:");
        shoes.stream().sorted(priceAsc).forEach(out::println);
        out.println("\nDescending:");
        shoes.stream().sorted(priceDesc).forEach(out::println);

        out.println("\n3.Sort by String (Brand):");
        shoes.stream().sorted(brandComparator).forEach(out::println);

        out.println("\n4.Sort by Name & Email:");
        shoes.stream().sorted(nameEmailComparator).forEach(out::println);

        out.println("\n5.Sort by Phone & Name:");
        shoes.stream().sorted(phoneNameComparator).forEach(out::println);

        out.println("\n6.Sort by Date:");
        shoes.stream().sorted(dateComparator).forEach(out::println);

        out.println("\n7.Sort by Domain:");
        shoes.stream().filter(domain -> domain.getBrandEmail().contains("@")).sorted(domainComparator).forEach(out::println);
    }
}
