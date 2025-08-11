package com.xworkz.association.runner;

import com.xworkz.association.dto.Chancellor;
import com.xworkz.association.dto.Detail;
import com.xworkz.association.dto.Education;
import com.xworkz.association.dto.University;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        Chancellor c1 = new Chancellor("Dr. Rao", "Finance");
        Chancellor c2 = new Chancellor("Ms. Sheela", "Education");
        Chancellor c3 = new Chancellor("Mr. Dev", "Law");
        Chancellor c4 = new Chancellor("Ms. Anita", "Transport");

        University u1 = new University("VTU", "Minister A", "CS", c1);
        University u2 = new University("BU", "Minister B", "EC", c2);
        University u3 = new University("DU", "Minister C", "ME", c3);
        University u4 = new University("OU", "Minister D", "Civil", c4);

        Education e1 = new Education("Ravi", "PhD", u1);
        Education e2 = new Education("Arjun", "MTech", u2);
        Education e3 = new Education("Sita", "BE", u3);
        Education e4 = new Education("Kiran", "BSc", u4);

        Detail d1 = new Detail("Description 1", e1);
        Detail d2 = new Detail("Description 2", e2);
        Detail d3 = new Detail("Description 3", e3);
        Detail d4 = new Detail("Description 4", e4);

        List<Detail> details = Arrays.asList(d1, d2, d3, d4);


        List<Chancellor> chancellors = details.stream()
                .map(d -> d.getEducation().getUniversity().getChancellor())
                .collect(Collectors.toList());
        System.out.println("All Chancellors:");
        chancellors.forEach(System.out::println);


        List<String> portfolios = chancellors.stream()
                .map(Chancellor::getPortfolio)
                .collect(Collectors.toList());
        System.out.println("\nAll Portfolios:");
        portfolios.forEach(System.out::println);

        List<String> universities = details.stream()
                .map(d -> d.getEducation().getUniversity().getName())
                .collect(Collectors.toList());
        System.out.println("\nUniversity Names:");
        universities.forEach(System.out::println);

        List<String> ministers = details.stream()
                .map(d -> d.getEducation().getUniversity().getMinister())
                .collect(Collectors.toList());
        System.out.println("\nMinisters:");
        ministers.forEach(System.out::println);

        Set<String> departments = details.stream()
                .map(d -> d.getEducation().getUniversity().getDepartment())
                .collect(Collectors.toSet());
        System.out.println("\nDepartments:");
        departments.forEach(System.out::println);

        System.out.println("\nStaff and Education:");
        details.forEach(d -> System.out.println(d.getEducation().getStaffName() + " -> " + d.getEducation().getQualification()));
    }
}
