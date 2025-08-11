package com.xworkz.bank.service;

import com.xworkz.bank.dto.BankDTO;
import com.xworkz.bank.repository.BankRepository;
import com.xworkz.bank.repository.BankRepositoryImpl;

public class BankServiceImpl implements BankService{


    @Override
    public String validate(BankDTO bankDTO) {
        String name= bankDTO.getName();
        String accno= bankDTO.getAccno();

        BankRepository repository = new BankRepositoryImpl();
        repository.save(bankDTO);

        return "saved succesfuly";
    }

}
