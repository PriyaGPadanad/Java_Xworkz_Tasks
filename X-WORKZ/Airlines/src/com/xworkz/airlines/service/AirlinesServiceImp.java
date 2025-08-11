package com.xworkz.airlines.service;

import com.xworkz.airlines.dto.AirlinesDTO;
import com.xworkz.airlines.repository.AirlinesRepository;
import com.xworkz.airlines.repository.AirlinesRepositoryImp;

public class AirlinesServiceImp implements AirlinesService {


    @Override
    public String validate(AirlinesDTO airlinesDTO) {

        System.out.println("Connected to Service ");
        if (airlinesDTO != null) {

            String name = airlinesDTO.getName();
            String source = airlinesDTO.getSource();
            String destination=airlinesDTO.getDestination();
            String flightCode=airlinesDTO.getFlightCode();
            String classType=airlinesDTO.getClassType();
            String mealType=airlinesDTO.getMealType();
            String international=airlinesDTO.getInternational();


            if (name != null && name.length() > 4 && name.length() < 30) {
                System.out.println("name is valid");
            }
            else if (source!=null) {
                System.out.println("source is valid");
            }
            else if (destination!=null) {
                System.out.println("destination is valid");
            }
            else if (flightCode!=null) {
                System.out.println("flightCode is valid");
            }
            else if (classType!=null) {
                System.out.println("classType is valid");
            }
            else if (mealType!=null) {
                System.out.println("mealType is valid");
            }
            else if (international!=null) {
                System.out.println("international is valid");
            }

            else{
                System.out.println("data is in-valid");
                return "please enter valid details";
            }


            AirlinesRepository airlinesRepository = new AirlinesRepositoryImp();
            airlinesRepository.save(airlinesDTO);

        }
        return "details saved successfully";

    }

    public AirlinesDTO findById(int id){
        if(id<0){
            System.out.println("Id is invalid");
            return null;
        }
        else{
            System.out.println("Id is valid");
            AirlinesRepository airlinesRepository=new AirlinesRepositoryImp() ;
            return airlinesRepository.findById(id);
            }
        }
    }
