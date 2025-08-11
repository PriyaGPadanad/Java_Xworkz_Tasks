package com.xworkz.mobile.service;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.repository.MobileRepository;
import com.xworkz.mobile.repository.MobileRepositoryImpl;

public class MobileServiceImpl implements MobileService {
    @Override
    public String validate(MobileDTO mobileDTO) {
        System.out.println("Connected to Service");
        if(mobileDTO!=null){
            int mobileId=mobileDTO.getMobileId();
            String brand= mobileDTO.getBrand();
            String model= mobileDTO.getModel();
            String operatingSystem=mobileDTO.getOperatingSystem();
            int ramSize=mobileDTO.getRamSize();
            int storageCapacity =mobileDTO.getStorageCapacity();
            double price=mobileDTO.getPrice();
            float rating=mobileDTO.getRating();

            MobileRepository mobileRepository=new MobileRepositoryImpl();
            mobileRepository.save(mobileDTO);
        }
        return "details saved successfully";

    }
}
