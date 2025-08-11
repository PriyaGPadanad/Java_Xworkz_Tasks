

package com.xworkz.general.service;

        import com.xworkz.general.dto.BirthCertificateDTO;

public class BirthServiceImpl implements BirthService{
    @Override
    public String validate(BirthCertificateDTO birthDTO) {
        return "false" ;
    }
}