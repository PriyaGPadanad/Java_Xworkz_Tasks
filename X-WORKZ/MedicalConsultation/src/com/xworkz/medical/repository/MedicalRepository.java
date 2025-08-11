package com.xworkz.medical.repository;

import com.xworkz.medical.dto.MedicalDTO;

public interface MedicalRepository {

    String save(MedicalDTO medicalDTO);
    MedicalDTO getdata();

}
