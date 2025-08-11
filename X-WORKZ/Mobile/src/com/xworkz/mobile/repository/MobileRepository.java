package com.xworkz.mobile.repository;

import com.xworkz.mobile.dto.MobileDTO;

import java.util.List;

public interface MobileRepository {
    String save(MobileDTO mobileDTO);
   List<MobileDTO> getData();
}
