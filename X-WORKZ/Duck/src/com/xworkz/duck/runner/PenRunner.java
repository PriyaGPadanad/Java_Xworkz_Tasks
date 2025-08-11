package com.xworkz.duck.runner;

import com.xworkz.duck.dto.PenDto;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PenRunner {
    public static void main(String[] args) {
        List<PenDto> pens = Stream.of(
                new PenDto("Gel", "Cello", 15, "cello@brand.com", 9876543210L, LocalDateTime.now()),
                new PenDto("Ball", "Reynolds", 10, "reynolds@brand.com", 9765432109L, LocalDateTime.now()),
                new PenDto("Fountain", "Parker", 250, "parker@brand.com", 9234567890L, LocalDateTime.now()),
                new PenDto("Marker", "Faber", 50, "faber@brand.com", 9123456789L, LocalDateTime.now()),
                new PenDto("Sketch", "Camlin", 20, "camlin@brand.com", 9345678901L, LocalDateTime.now()),
                new PenDto("Brush", "Luxor", 35, "luxor@brand.com", 9212345678L, LocalDateTime.now()),
                new PenDto("Technical", "Staedtler", 70, "staedtler@brand.com", 9654321098L, LocalDateTime.now()),
                new PenDto("Roller", "Pilot", 30, "pilot@brand.com", 9876543211L, LocalDateTime.now())
        ).collect(Collectors.toList());

        Comparator<PenDto> priceComparator = Comparator.comparingInt(PenDto::getCost);
        Comparator<PenDto> priceDesc = (o1, o2) -> Integer.compare(o2.getCost(), o1.getCost());
        Comparator<PenDto> brandComparator = Comparator.comparing(PenDto::getBrand);
        Comparator<PenDto> typeEmailComparator = Comparator.comparing(PenDto::getType).thenComparing(PenDto::getEmail);
        Comparator<PenDto> phoneTypeComparator = Comparator.comparing(PenDto::getPhone).thenComparing(PenDto::getType);
        Comparator<PenDto> dateComparator = Comparator.comparing(PenDto::getDate);
        Comparator<PenDto> domainComparator = Comparator.comparing(PenDto::getEmail);

        System.out.println("Sort by Cost Ascending:");
        pens.stream().sorted(priceComparator).forEach(System.out::println);

        System.out.println("\nSort by Cost Descending:");
        pens.stream().sorted(priceDesc).forEach(System.out::println);

        System.out.println("\nSort by Brand:");
        pens.stream().sorted(brandComparator).forEach(System.out::println);

        System.out.println("\nSort by Type & Email:");
        pens.stream().sorted(typeEmailComparator).forEach(System.out::println);

        System.out.println("\nSort by Phone & Type:");
        pens.stream().sorted(phoneTypeComparator).forEach(System.out::println);

        System.out.println("\nSort by Date:");
        pens.stream().sorted(dateComparator).forEach(System.out::println);

        System.out.println("\nSort by Email Domain:");
        pens.stream().filter(email -> email.getEmail().contains("@")).sorted(domainComparator).forEach(System.out::println);
    }
}
