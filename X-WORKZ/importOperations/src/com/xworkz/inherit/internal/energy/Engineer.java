package com.xworkz.inherit.internal.energy;

public class Engineer {
    public void manage(Energy energy){
        energy.generate();
        energy.store();
        energy.transmit();
        energy.convert();
        energy.consume();

        if(energy instanceof SolarEnergy){
            System.out.println("energy ia an instance of solarEnergy");
            SolarEnergy solar=(SolarEnergy)energy;
            solar.trackSunlight();
        }
    }
}
