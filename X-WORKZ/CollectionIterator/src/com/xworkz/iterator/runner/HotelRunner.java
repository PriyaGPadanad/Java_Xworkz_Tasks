package com.xworkz.iterator.runner;

import com.xworkz.iterator.dto.HotelDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HotelRunner {
    public static void main(String[] args) {
        Collection<HotelDTO> hotelCollection = new ArrayList<>();
        hotelCollection.add(new HotelDTO("The Leela", "Bangalore", 5, 12000.0, true, "12:00 PM", "11:00 AM", 200, "leela@hotel.com", true));
        hotelCollection.add(new HotelDTO("Taj", "Goa", 5, 15000.0, true, "1:00 PM", "11:30 AM", 250, "taj@hotel.com", true));
        hotelCollection.add(new HotelDTO("ITC Gardenia", "Chennai", 4, 9000.0, true, "2:00 PM", "12:00 PM", 180, "itc@hotel.com", true));
        hotelCollection.add(new HotelDTO("The Fern", "Udupi", 3, 4500.0, true, "1:00 PM", "11:00 AM", 120, "fern@hotel.com", true));
        hotelCollection.add(new HotelDTO("Treebo Trend", "Mysore", 3, 3999.0, false, "12:00 PM", "10:00 AM", 100, "treebo@hotel.com", false));
        hotelCollection.add(new HotelDTO("The Park", "Pune", 4, 7999.0, true, "2:00 PM", "12:00 PM", 160, "park@hotel.com", true));
        hotelCollection.add(new HotelDTO("Hotel Green", "Mangalore", 2, 2999.0, false, "1:00 PM", "11:00 AM", 80, "green@hotel.com", false));
        hotelCollection.add(new HotelDTO("Royal Orchid", "Hyderabad", 4, 8500.0, true, "12:30 PM", "11:00 AM", 140, "orchid@hotel.com", true));
        hotelCollection.add(new HotelDTO("Hotel Bliss", "Mumbai", 3, 5500.0, true, "2:00 PM", "12:00 PM", 110, "bliss@hotel.com", true));
        hotelCollection.add(new HotelDTO("Hotel Comfort", "Delhi", 2, 2500.0, false, "1:00 PM", "10:00 AM", 90, "comfort@hotel.com", false));

        Iterator<HotelDTO> iterator = hotelCollection.iterator();
        while(iterator.hasNext()) {
            HotelDTO hotel = iterator.next();
            System.out.println("hotel:"+ hotel);
        }
    }
}

