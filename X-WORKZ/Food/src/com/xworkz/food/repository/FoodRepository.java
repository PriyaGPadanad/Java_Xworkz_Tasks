package com.xworkz.food.repository;

import com.xworkz.food.dto.FoodDTO;

import java.util.List;

public interface FoodRepository {

    String save(FoodDTO foodDTO);

    List<FoodDTO> getData();
}
