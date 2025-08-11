package com.xworkz.college.runner;

import com.xworkz.college.entity.CollegeEntity;
import com.xworkz.college.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CollegeRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("Xworkz");
        EntityManager eM=eMF.createEntityManager();
        EntityTransaction eT= eM.getTransaction();
        eT.begin();

        List<CollegeEntity> collegeEntities = new ArrayList<>();
        collegeEntities.add(new CollegeEntity(1, "Indian Institute of Technology Bombay", "Mumbai", 10000, 600, 75));
        collegeEntities.add(new CollegeEntity(2, "National Institute of Technology Trichy", "Tiruchirappalli", 8500, 450, 60));
        collegeEntities.add(new CollegeEntity(3, "Visvesvaraya Technological University", "Belagavi", 12000, 500, 80));
        collegeEntities.add(new CollegeEntity(4, "Anna University", "Chennai", 9500, 520, 70));
        collegeEntities.add(new CollegeEntity(5, "Delhi Technological University", "Delhi", 9000, 480, 65));
        collegeEntities.add(new CollegeEntity(6, "BMS College of Engineering", "Bengaluru", 7000, 350, 50));
        collegeEntities.add(new CollegeEntity(7, "Vellore Institute of Technology", "Vellore", 11000, 550, 85));
        collegeEntities.add(new CollegeEntity(8, "SRM Institute of Science and Technology", "Chennai", 10500, 500, 78));
        collegeEntities.add(new CollegeEntity(9, "Jadavpur University", "Kolkata", 8000, 400, 55));
        collegeEntities.add(new CollegeEntity(10, "Manipal Institute of Technology", "Manipal", 9500, 470, 72));

        for(CollegeEntity collegeEntity:collegeEntities){
            eM.persist(collegeEntity);
        }

        CollegeEntity collegeEntity=eM.find(CollegeEntity.class,1);


        List<StudentEntity> studentEntities = new ArrayList<>();
        studentEntities.add(new StudentEntity(1, "Priya Sharma", "Computer Science", "priya.sharma@example.com", 9876543210L, "Bengaluru"));
        studentEntities.add(new StudentEntity(2, "Rahul Verma", "Mechanical", "rahul.verma@example.com", 9123456789L, "Mumbai"));
        studentEntities.add(new StudentEntity(3, "Sneha Reddy", "Electronics", "sneha.reddy@example.com", 9988776655L, "Hyderabad"));
        studentEntities.add(new StudentEntity(4, "Amit Joshi", "Civil", "amit.joshi@example.com", 9871234567L, "Pune"));
        studentEntities.add(new StudentEntity(5, "Neha Kapoor", "Information Technology", "neha.kapoor@example.com", 9765432109L, "Delhi"));
        studentEntities.add(new StudentEntity(6, "Karan Mehta", "Electrical", "karan.mehta@example.com", 9654321098L, "Ahmedabad"));
        studentEntities.add(new StudentEntity(7, "Divya Nair", "Biotechnology", "divya.nair@example.com", 9543210987L, "Chennai"));
        studentEntities.add(new StudentEntity(8, "Rohan Singh", "Computer Science", "rohan.singh@example.com", 9432109876L, "Lucknow"));
        studentEntities.add(new StudentEntity(9, "Anjali Das", "Mechanical", "anjali.das@example.com", 9321098765L, "Kolkata"));
        studentEntities.add(new StudentEntity(10, "Vikram Chauhan", "Electronics", "vikram.chauhan@example.com", 9210987654L, "Jaipur"));

        for(StudentEntity studentEntity:studentEntities){
            eM.persist(studentEntity);
        }

        StudentEntity studentEntity=eM.find(StudentEntity.class,1);

        eT.commit();
        eM.close();
    }
}
