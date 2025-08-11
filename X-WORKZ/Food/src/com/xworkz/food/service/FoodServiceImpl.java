package com.xworkz.food.service;

import com.xworkz.food.dto.FoodDTO;
import com.xworkz.food.repository.FoodRepository;
import com.xworkz.food.repository.FoodRepositoryImpl;

public class FoodServiceImpl implements FoodService{
    @Override
    public String validate(FoodDTO foodDTO) {
        System.out.println("Connected to Service");
        if(foodDTO!=null){
            int foodId= foodDTO.getFoodId();
            String name= foodDTO.getName();
            String description= foodDTO.getDescription();
            String category= foodDTO.getCategory();
            double price= foodDTO.getPrice();
            boolean availability= foodDTO.isAvailability();
            boolean type= foodDTO.isType();

            FoodRepository foodRepository=new FoodRepositoryImpl();
            foodRepository.save(foodDTO);
        }
        return "details saved successfully";
    }
}
