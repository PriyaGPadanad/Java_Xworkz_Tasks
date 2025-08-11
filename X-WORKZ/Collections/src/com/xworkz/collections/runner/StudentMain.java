package com.xworkz.collections.runner;

import com.xworkz.collections.dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<StudentDTO> students=new ArrayList<>();

        students.add(new StudentDTO("Pooja",21,"NITK","CSE",4,89,true));
        students.add(new StudentDTO("Sneha",21,"PESU","EEE",3,91,true));
        students.add(new StudentDTO("Rahul",22,"GMIT","ECE",4,78,false));
        students.add(new StudentDTO("Priya",22,"PESITM","CSE",4,80,false));
        students.add(new StudentDTO("Anjali",20,"RVCE","ISE",3,88,true));

        students.set(2,new StudentDTO("Lasya",22,"JNNCE","Civil",4,76,false));

        System.out.println("Total students:"+students.size());
        System.out.println("All Students:");
        for(StudentDTO student:students){
            System.out.println(student);
        }
    }
}
