package com.xworkz.inherit.internal.energy;

public class EnergyRunner {
    public static void main(String[] args){
        Energy energy1 =new Energy();
        energy1.generate();
        energy1.store();
        energy1.transmit();
        energy1.convert();
        energy1.consume();

        System.out.println("------");
        Energy energy=new SolarEnergy();
        energy.generate();
        energy.store();
        energy.transmit();
        energy.convert();
        energy.consume();

        System.out.println("---------");
        SolarEnergy solar=new SolarEnergy();
        solar.generate();
        solar.store();
        solar.transmit();
        solar.convert();
        solar.consume();

        System.out.println("----casting Example_____");
        Engineer eng=new Engineer();
        eng.manage(energy1);
        eng.manage(energy);
        eng.manage(solar);

    }
}
