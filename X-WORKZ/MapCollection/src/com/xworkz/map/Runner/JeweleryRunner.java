package com.xworkz.map.Runner;

import com.xworkz.map.dto.JeweleryDTO;

import java.util.HashMap;
import java.util.Map;

public class JeweleryRunner {
    public static void main(String[] args) {
        Map<String, JeweleryDTO> jewelwryDtoMap=new HashMap<>();
        jewelwryDtoMap.put("Gold Chain",new JeweleryDTO("Gold","Chain",20000,"bhima Jewelers","22K"));
        jewelwryDtoMap.put("Platinum Ring",new JeweleryDTO("Platinum","Hand Ring",50000,"ANNA Jewelers","15k"));
        jewelwryDtoMap.put("Silver Anklet",new JeweleryDTO("Silvrer","leg Accessory",10000,"maamu Jewelers","21k"));
        jewelwryDtoMap.put("Gold EarRing",new JeweleryDTO("Gold","Ear ring",50000,"Ayaan Jewelers","24k"));

        for(Map.Entry<String,JeweleryDTO> map: jewelwryDtoMap.entrySet()){
            System.out.println("Key:"+map.getKey()+" Value:"+map.getValue());
        }



    }
}
