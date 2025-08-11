package com.xworkz.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class CollegeEntity {
    @Id
    private int id;

    @Column(name="college_name")
    private String collegeName;
    private String location;
    private int students;
    private int faculties;
    private int courses;

    public CollegeEntity(int id, String collegeName, String location, int students, int faculties, int courses) {
        this.id = id;
        this.collegeName = collegeName;
        this.location = location;
        this.students = students;
        this.faculties = faculties;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getFaculties() {
        return faculties;
    }

    public void setFaculties(int faculties) {
        this.faculties = faculties;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
}
