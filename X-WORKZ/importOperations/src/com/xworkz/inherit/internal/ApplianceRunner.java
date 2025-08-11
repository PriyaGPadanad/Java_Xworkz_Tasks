package com.xworkz.inherit.internal;

public class ApplianceRunner {
    public static void main(String[] args) {

        // 1. Waffle Maker
        System.out.println("----- WaffleMaker -----");
        Appliance waffle = new WaffleMaker();
        waffle.use();
        waffle.getBrand();
        waffle.getPower();
        waffle.getType();
        waffle.getWarranty();

        System.out.println("-----");

        // 2. Popcorn Machine
        System.out.println("----- PopcornMachine -----");
        Appliance popcorn = new PopcornMachine();
        popcorn.use();
        popcorn.getBrand();
        popcorn.getPower();
        popcorn.getType();
        popcorn.getWarranty();

        System.out.println("-----");

        // 3. Ice Cream Maker
        System.out.println("----- IceCreamMaker -----");
        Appliance iceCream = new IceCreamMaker();
        iceCream.use();
        iceCream.getBrand();
        iceCream.getPower();
        iceCream.getType();
        iceCream.getWarranty();

        System.out.println("-----");

        // 4. Electric Blanket
        System.out.println("----- ElectricBlanket -----");
        Appliance blanket = new ElectricBlanket();
        blanket.use();
        blanket.getBrand();
        blanket.getPower();
        blanket.getType();
        blanket.getWarranty();

        System.out.println("-----");

        // 5. Humidifier
        System.out.println("----- Humidifier -----");
        Appliance humidifier = new Humidifier();
        humidifier.use();
        humidifier.getBrand();
        humidifier.getPower();
        humidifier.getType();
        humidifier.getWarranty();

        System.out.println("-----");

        // 6. Dehumidifier
        System.out.println("----- Dehumidifier -----");
        Appliance dehumidifier = new Dehumidifier();
        dehumidifier.use();
        dehumidifier.getBrand();
        dehumidifier.getPower();
        dehumidifier.getType();
        dehumidifier.getWarranty();

        System.out.println("-----");

        // 7. Space Heater
        System.out.println("----- SpaceHeater -----");
        Appliance heater = new SpaceHeater();
        heater.use();
        heater.getBrand();
        heater.getPower();
        heater.getType();
        heater.getWarranty();

        System.out.println("-----");

        // 8. Vacuum Sealer
        System.out.println("----- VacuumSealer -----");
        Appliance sealer = new VacuumSealer();
        sealer.use();
        sealer.getBrand();
        sealer.getPower();
        sealer.getType();
        sealer.getWarranty();

        System.out.println("-----");

        // 9. Clothes Steamer
        System.out.println("----- ClothesSteamer -----");
        Appliance steamer = new ClothesSteamer();
        steamer.use();
        steamer.getBrand();
        steamer.getPower();
        steamer.getType();
        steamer.getWarranty();

        System.out.println("-----");

        // 10. Projector
        System.out.println("----- Projector -----");
        Appliance projector = new Projector();
        projector.use();
        projector.getBrand();
        projector.getPower();
        projector.getType();
        projector.getWarranty();

        System.out.println("----- All Appliances Tested -----");
    }
}


