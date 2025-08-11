package com.xworkz.student.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
        private int studentId;
        private String name;
        private String email;
        private String phoneNumber;
        private String gender;
        private String course;
        private String department;
        private int year;


    public StudentDTO(int studentId, String name, String email, String phoneNumber, String gender, String course, String department, int year) {
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.course=course;
        this.department=department;
        this.year=year;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", course='" + course + '\'' +
                ", department='" + department + '\'' +
                ", year=" + year +
                '}';
    }

}

