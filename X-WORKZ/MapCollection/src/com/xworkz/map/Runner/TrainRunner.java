package com.xworkz.map.Runner;

import com.xworkz.map.dto.TrainDTO;

import java.util.HashMap;
import java.util.Map;

public class TrainRunner {
    public static void main(String[] args) {
        Map<String , TrainDTO> trainMap=new HashMap<>();


        trainMap.put("VandeBharath",new TrainDTO("Express","mangalore","trivendrum","AC",234566,"Electric",1,"7hrs",2000,"ACseatear"));
        trainMap.put("Masygandha",new TrainDTO("Semi-Express","mangalore","Pune","non-Ac",778866,"Electric",1,"17hrs",200,"general"));
        trainMap.put("PrayagRajExpress",new TrainDTO("Express","Bangalore","UP","non-AC",789566,"Electric",1,"48hrs",700,"Sleeper"));
        trainMap.put("Netravathi",new TrainDTO("Express","mangalore","trivendrum","AC",245666,"Electric",1,"7hrs",2500,"ACSleeper"));
        trainMap.put("Amgel travel Exp",new TrainDTO("Local","mangalore","Karwar","Non-AC",908566,"deisel",1,"5hrs",250,"Sleeper"));


        for(Map.Entry<String,TrainDTO> map:trainMap.entrySet()){
            System.out.println("Tarin Name:"+map.getKey()+"train Details "+map.getValue());
        }




    }
}
