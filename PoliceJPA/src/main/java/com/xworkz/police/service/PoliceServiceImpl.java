package com.xworkz.police.service;

import com.xworkz.police.entity.PoliceEntity;
import com.xworkz.police.repository.PoliceRepository;
import com.xworkz.police.repository.PoliceRepositoryImpl;

import java.util.List;


public class PoliceServiceImpl implements PoliceService {

    @Override
    public void save(List<PoliceEntity> list) {
        PoliceRepository policeRepository = new PoliceRepositoryImpl();
        policeRepository.save(list);
    }

    @Override
    public List<PoliceEntity> getAll() {
        return new PoliceRepositoryImpl().getAll();
    }

    @Override
    public List<PoliceEntity> getPoliceEntityByName(String name) {
        return new PoliceRepositoryImpl().getPoliceEntityByName(name);
    }

    @Override
    public PoliceEntity getPoliceEntityByNameAndPhone(String name, long phone) {
        return new PoliceRepositoryImpl().getPoliceEntityByNameAndPhone(name, phone);
    }

    @Override
    public List<PoliceEntity> getPoliceByAgeAbove25() {
        return new PoliceRepositoryImpl().getPoliceByAgeAbove25();
    }

    @Override
    public List<PoliceEntity> getAgeBetween20And30() {
        return new PoliceRepositoryImpl().getAgeBetween20And30();
    }

    @Override
    public PoliceEntity getByEmail(String email) {
        return new PoliceRepositoryImpl().getByEmail(email);
    }

    @Override
    public PoliceEntity getByPhone(long phone) {
        return new PoliceRepositoryImpl().getByPhone(phone);
    }

    @Override
    public String getNameByPlace(String place) {
        return new PoliceRepositoryImpl().getNameByPlace(place);
    }

    @Override
    public PoliceEntity getNameAndAgeByPhoneNo(long phoneNo) {
        return new PoliceRepositoryImpl().getNameAndAgeByPhoneNo(phoneNo);
    }

    @Override
    public List<String> getNameByAgeAbove30() {
        return new PoliceRepositoryImpl().getNameByAgeAbove30();
    }

    @Override
    public List<PoliceEntity> getNamePlaceEmailByAgeLessThan30() {
        return new PoliceRepositoryImpl().getNamePlaceEmailByAgeLessThan30();
    }
}
