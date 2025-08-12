package com.xworkz.police.repository;

import com.xworkz.police.entity.PoliceEntity;

import java.util.List;

public interface PoliceRepository {

    void save(List<PoliceEntity> list);

    List<PoliceEntity> getAll();

    List<PoliceEntity> getPoliceEntityByName(String name);

    PoliceEntity getPoliceEntityByNameAndPhone(String name, long phone);

    List<PoliceEntity> getPoliceByAge();

    List<PoliceEntity> getAgeBetween();

    List<PoliceEntity> getPoliceByAgeAbove25();

    List<PoliceEntity> getAgeBetween20And30();

    PoliceEntity getByEmail(String email);

    PoliceEntity getByPhone(long phone);

    String getNameByPlace(String place);

    PoliceEntity getNameAndAgeByPhoneNo(long phoneNo);

    List<String> getNameByAge();

    List<PoliceEntity> getNameAndPlaceAndEmailByAgeLessThan30();

    List<String> getNameByAgeAbove30();

    List<PoliceEntity> getNamePlaceEmailByAgeLessThan30();
}



