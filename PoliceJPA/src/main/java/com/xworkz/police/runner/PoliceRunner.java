package com.xworkz.police.runner;


import com.xworkz.police.entity.PoliceEntity;
import com.xworkz.police.service.PoliceService;
import com.xworkz.police.service.PoliceServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PoliceRunner {
    public static void main(String[] args) {
        PoliceService policeService = new PoliceServiceImpl();

        List<PoliceEntity> policeList = new ArrayList<>();

        policeList.add(new PoliceEntity("Amit", 27, "Delhi", "amit123@gmail.com", 9876543210L));
        policeList.add(new PoliceEntity("Ravi", 31, "Mumbai", "ravi_police@gmail.com", 9812345670L));
        policeList.add(new PoliceEntity("Kiran", 25, "Bangalore", "kiran.k@gmail.com", 9988776655L));
        policeList.add(new PoliceEntity("Suraj", 29, "Pune", "suraj99@gmail.com", 9765432109L));
        policeList.add(new PoliceEntity("Vikas", 33, "Hyderabad", "vikas_bir@gmail.com", 9123456789L));
        policeList.add(new PoliceEntity("Rohan", 26, "Chennai", "rohan.pol@gmail.com", 9345678921L));
        policeList.add(new PoliceEntity("Anil", 35, "Kolkata", "anil.kh@gmail.com", 9012345678L));
        policeList.add(new PoliceEntity("Manoj", 30, "Lucknow", "manoj.chaudhary@gmail.com", 9834567890L));
        policeList.add(new PoliceEntity("Arjun", 28, "Patna", "arjun.pat@gmail.com", 9876543021L));
        policeList.add(new PoliceEntity("Nikhil", 24, "Nagpur", "nikhil12@gmail.com", 9867543210L));
        policeList.add(new PoliceEntity("Rahul", 27, "Bhopal", "rahul_verma@gmail.com", 9321456789L));
        policeList.add(new PoliceEntity("Suresh", 32, "Jaipur", "suresh.rathod@gmail.com", 9888123456L));
        policeList.add(new PoliceEntity("Prakash", 36, "Ahmedabad", "prakash_singh@gmail.com", 9901234567L));
        policeList.add(new PoliceEntity("Vijay", 29, "Indore", "vijay34@gmail.com", 9845612370L));
        policeList.add(new PoliceEntity("Ajay", 33, "Coimbatore", "ajay.nair@gmail.com", 9781234567L));
        policeList.add(new PoliceEntity("Sanjay", 30, "Nashik", "sanjay.kumar@gmail.com", 9756123498L));
        policeList.add(new PoliceEntity("Deepak", 28, "Raipur", "deepak.rana@gmail.com", 9870012345L));
        policeList.add(new PoliceEntity("Harish", 34, "Guwahati", "harish.bora@gmail.com", 9845098765L));
        policeList.add(new PoliceEntity("Kamal", 31, "Amritsar", "kamal.dev@gmail.com", 9823456123L));
        policeList.add(new PoliceEntity("Rakesh", 29, "Varanasi", "rakesh.singh@gmail.com", 9898765432L));

        PoliceService policeService = new PoliceServiceImpl();
        policeService.save(policeList);


        // 1. getAll()
        System.out.println("Getting all data from DB...");
        List<PoliceEntity> list = policeService.getAll();
        list.forEach(System.out::println);

        // 2. get by name
        System.out.println("All data by name");
        List<PoliceEntity> list1 = policeService.getPoliceEntityByName("Amit");
        list1.forEach(System.out::println);

        // 3. get by name and phone
        System.out.println("All data by name and phone");
        PoliceEntity policeEntity = policeService.getPoliceEntityByNameAndPhone("Ajay", 9781234567L);
        System.out.println(policeEntity);

        // 4. Age > 25
        System.out.println("All data where age > 25");
        List<PoliceEntity> list2 = policeService.getPoliceByAge();
        list2.forEach(System.out::println);

        // 5. Age between 20 and 30
        System.out.println("Get data between 20 and 30");
        List<PoliceEntity> list3 = policeService.getAgeBetween();
        list3.forEach(System.out::println);

        // 6. Get by email
        System.out.println("Get data by email");
        PoliceEntity policeEntity1 = policeService.getByEmail("ajay.nair@gmail.com");
        System.out.println(policeEntity1);

        // 7. Get by phoneNo
        System.out.println("Get data by phoneNo");
        PoliceEntity policeEntity2 = policeService.getByPhone(9870012345L);
        System.out.println(policeEntity2);
    }
}
