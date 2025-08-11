package com.xworkz.duck.runner;

import com.xworkz.duck.dto.WatchDto;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WatchRunner {
    public static void main(String[] args) {
        List<WatchDto> watches = Stream.of(
                new WatchDto("AnalogX", "Titan", 2500, "titan@watch.com", 9001122334L, LocalDateTime.now()),
                new WatchDto("DigitalPro", "Casio", 3500, "casio@watch.com", 9887766554L, LocalDateTime.now()),
                new WatchDto("Elite", "Fossil", 4500, "fossil@brand.com", 9123456780L, LocalDateTime.now()),
                new WatchDto("Chrono", "Seiko", 5500, "seiko@watch.com", 9112233445L, LocalDateTime.now()),
                new WatchDto("SportX", "Timex", 1500, "timex@brand.com", 9000012345L, LocalDateTime.now()),
                new WatchDto("Luxury", "Rolex", 9500, "rolex@brand.com", 9900112233L, LocalDateTime.now()),
                new WatchDto("GoldPro", "Omega", 8500, "omega@watch.com", 9880011223L, LocalDateTime.now()),
                new WatchDto("Prestige", "Rado", 7500, "rado@watch.com", 9776655443L, LocalDateTime.now())
        ).collect(Collectors.toList());

        Comparator<WatchDto> priceComparator = Comparator.comparingInt(WatchDto::getPrice);
        Comparator<WatchDto> priceDesc = (o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice());
        Comparator<WatchDto> brandComparator = Comparator.comparing(WatchDto::getBrand);
        Comparator<WatchDto> nameEmailComparator = Comparator.comparing(WatchDto::getModel).thenComparing(WatchDto::getEmail);
        Comparator<WatchDto> phoneNameComparator = Comparator.comparing(WatchDto::getPhone).thenComparing(WatchDto::getModel);
        Comparator<WatchDto> dateComparator = Comparator.comparing(WatchDto::getDate);
        Comparator<WatchDto> domainComparator = Comparator.comparing(WatchDto::getEmail);

        System.out.println("Sort by Price Ascending:");
        watches.stream().sorted(priceComparator).forEach(System.out::println);

        System.out.println("\nSort by Price Descending:");
        watches.stream().sorted(priceDesc).forEach(System.out::println);

        System.out.println("\nSort by Brand:");
        watches.stream().sorted(brandComparator).forEach(System.out::println);

        System.out.println("\nSort by Model & Email:");
        watches.stream().sorted(nameEmailComparator).forEach(System.out::println);

        System.out.println("\nSort by Phone & Model:");
        watches.stream().sorted(phoneNameComparator).forEach(System.out::println);

        System.out.println("\nSort by Date:");
        watches.stream().sorted(dateComparator).forEach(System.out::println);

        System.out.println("\nSort by Email Domain:");
        watches.stream().filter(email -> email.getEmail().contains("@")).sorted(domainComparator).forEach(System.out::println);
    }
}
