package com.xworkz.airlines.repository;

import com.xworkz.airlines.dto.AirlinesDTO;

public interface AirlinesRepository {
    String save(AirlinesDTO airlinesDTO);

    AirlinesDTO findById(int id);
}
