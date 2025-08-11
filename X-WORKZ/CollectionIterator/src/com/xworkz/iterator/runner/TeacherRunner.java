package com.xworkz.iterator.runner;

import com.xworkz.iterator.dto.TeacherDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TeacherRunner {
    public static void main(String[] args) {
        Collection<TeacherDTO> teacherCollection = new ArrayList<>();
        teacherCollection.add(new TeacherDTO("Sneha", 5, "Math", 45000.0, "M.Sc", "Female", "sneha@gmail.com", 30, "Bangalore", true));
        teacherCollection.add(new TeacherDTO("Riya", 8, "Science", 50000.0, "M.Sc", "Female", "riya@gmail.com", 35, "Mysuru", true));
        teacherCollection.add(new TeacherDTO("Divya", 10, "English", 48000.0, "MA", "Female", "divya@gmail.com", 34, "Hubli", true));
        teacherCollection.add(new TeacherDTO("Anil", 6, "Physics", 51000.0, "PhD", "Male", "anil@gmail.com", 32, "Dharwad", false));
        teacherCollection.add(new TeacherDTO("Kavya", 3, "Chemistry", 46000.0, "M.Sc", "Female", "kavya@gmail.com", 28, "Mangalore", true));
        teacherCollection.add(new TeacherDTO("Pooja", 7, "Biology", 49000.0, "M.Sc", "Female", "pooja@gmail.com", 29, "Belgaum", true));
        teacherCollection.add(new TeacherDTO("Manoj", 4, "Kannada", 42000.0, "MA", "Male", "manoj@gmail.com", 31, "Tumkur", true));
        teacherCollection.add(new TeacherDTO("Neha", 9, "History", 53000.0, "MA", "Female", "neha@gmail.com", 33, "Udupi", false));
        teacherCollection.add(new TeacherDTO("Ajay", 6, "Computer", 55000.0, "MCA", "Male", "ajay@gmail.com", 30, "Shimoga", true));
        teacherCollection.add(new TeacherDTO("Deepa", 2, "Social", 40000.0, "MA", "Female", "deepa@gmail.com", 27, "Hassan", true));

        Iterator<TeacherDTO> iterator = teacherCollection.iterator();
        while(iterator.hasNext()) {
            TeacherDTO teacher = iterator.next();
            System.out.println(teacher);
        }
    }
}
