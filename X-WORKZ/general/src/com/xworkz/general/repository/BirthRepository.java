package com.xworkz.general.repository;


import com.xworkz.general.dto.BirthCertificateDTO;

    public interface BirthRepository {

        String save(BirthCertificateDTO birthDTO);
    }

