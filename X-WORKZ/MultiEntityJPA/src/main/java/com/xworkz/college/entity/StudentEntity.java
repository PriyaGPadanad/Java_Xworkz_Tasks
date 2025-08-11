package com.xworkz.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    private int id;
    @Column(name="student_name")
    private String studentName;

    private String branch;
    private String email;
    private long phone;
    private String city;

    public StudentEntity(int id, String studentName, String branch, String email, long phone, String city) {
        this.id = id;
        this.studentName = studentName;
        this.branch = branch;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", branch='" + branch + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                '}';
    }
}
