package com.xworkz.police.runner;

        import com.xworkz.police.service.PoliceService;
        import com.xworkz.police.service.PoliceServiceImpl;

public class GetNameByPlaceRunner {
    public static void main(String[] args) {
        PoliceService service = new PoliceServiceImpl();
        service.getNameByPlace("Delhi");
    }
}