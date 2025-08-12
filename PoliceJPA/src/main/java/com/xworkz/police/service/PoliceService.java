package com.xworkz.police.service;




import com.xworkz.police.entity.PoliceEntity;
import java.util.List;

public interface PoliceService {
    void save(List<PoliceEntity> list);

    List<PoliceEntity> getAll();

    List<PoliceEntity> getPoliceEntityByName(String name);

    PoliceEntity getPoliceEntityByNameAndPhone(String name, long phone);

    List<PoliceEntity> getPoliceByAge();

    List<PoliceEntity> getAgeBetween();

    PoliceEntity getByEmail(String email);

    PoliceEntity getByPhone(long phone);

    String getNameByPlace(String place);

    PoliceEntity getNameAndAgeByPhoneNo(long phoneNo);

    List<String> getNameByAge();

    List<PoliceEntity> getNameAndPlaceAndEmailByAgeLessThan30();
}
