package com.xworkz.police.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table(name = "police_table")
@NamedQuery(name = "getAll", query = "select entity from PoliceEntity entity")
@NamedQuery(name = "getEntityByName", query = "select entity from PoliceEntity entity where name=:name")
@NamedQuery(name = "getEntityByNameAndPhone", query = "select entity from PoliceEntity entity where name=:name and phoneNo=:phone")
@NamedQuery(name = "getAgeAbove25", query = "select entity from PoliceEntity entity where age>25")
@NamedQuery(name = "getAgeBetween20And30", query = "select entity from PoliceEntity entity where age between 20 and 30")
@NamedQuery(name = "getByEmail", query = "select e from PoliceEntity e where email=:email")
@NamedQuery(name = "getByPhone", query = "select e from PoliceEntity e where phoneNo=:phone")
@NamedQuery(name = "getNameByPlace", query = "select entity.name from PoliceEntity entity where place=:placeBy")
@NamedQuery(name = "getNameAndAgeByPhoneNo", query = "select entity.name,entity.age from PoliceEntity entity where phoneNo=:phoneBy")
@NamedQuery(name = "getNameAbove30", query = "select entity.name from PoliceEntity entity where age>30")
@NamedQuery(name = "getNameAndPlaceAndEmailByAgeLessThan30", query = "select entity.name,entity.place,entity.email from PoliceEntity entity where age<30")

public class PoliceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "police_name")
    private String name;

    @Column(name = "police_age")
    private int age;

    private String place;

    private String email;

    @Column(name = "phoneno")
    private long phoneNo;

    public PoliceEntity(String name, int age, String place, String email, long phoneNo) {
        this.name = name;
        this.age = age;
        this.place = place;
        this.email = email;
        this.phoneNo = phoneNo;
    }
}