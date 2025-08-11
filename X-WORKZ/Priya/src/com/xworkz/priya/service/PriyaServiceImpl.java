package com.xworkz.priya.service;

import com.xworkz.priya.dto.PriyaDTO;
import com.xworkz.priya.repository.PriyaRepository;
import com.xworkz.priya.repository.PriyaRepositoryImpl;

public class PriyaServiceImpl implements PriyaService{
    @Override
    public String Validate(PriyaDTO priyaDTO) {

        System.out.println("Connected to Service ");
        if(priyaDTO!= null) {
            PriyaRepository priyaRepository = new PriyaRepositoryImpl();
            priyaRepository.save(priyaDTO);

            return "success";
        }
        return "failure";
    }

}
