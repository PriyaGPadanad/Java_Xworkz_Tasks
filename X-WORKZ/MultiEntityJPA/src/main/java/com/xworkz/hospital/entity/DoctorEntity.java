package com.xworkz.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class DoctorEntity {
    @Id
    private int id;

    @Column(name="doctor_name")
    private String doctorName;
    private String specialization;
    private String hospital;
    private String doctorEmail;
    private long contact;

    public DoctorEntity(int id, String doctorName, String specialization, String hospital, String doctorEmail, long contact) {
        this.id = id;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.hospital = hospital;
        this.doctorEmail = doctorEmail;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "DoctorEntity{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", hospital='" + hospital + '\'' +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", contact=" + contact +
                '}';
    }
}
