package com.xworkz.medical.service;

import com.xworkz.medical.dto.MedicalDTO;
import com.xworkz.medical.repository.MedicalRepository;
import com.xworkz.medical.repository.MedicalRepositoryImpl;



public class MedicalServiceImpl implements MedicalService {
    @Override
    public String validate(MedicalDTO medicalDTO) {

        System.out.println("Connected to Service ");
        if (medicalDTO != null) {

            String name=medicalDTO.getName();
            String email=medicalDTO.getEmail();
            int age=medicalDTO.getAge();
            String gender=medicalDTO.getGender();
            String contactNumber=medicalDTO.getContactNumber();
            String consultationMode=medicalDTO.getConsultationMode();

            MedicalRepository medicalRepository=new MedicalRepositoryImpl();
            medicalRepository.save(medicalDTO);
        }
        return "details saved succcessfully";

    }
}
