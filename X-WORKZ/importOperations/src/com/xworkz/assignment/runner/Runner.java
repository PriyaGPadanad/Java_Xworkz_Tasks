
package com.xworkz.assignment.runner;

        import com.xworkz.assignment.interfaces.*;
        import com.xworkz.assignment.implementation.*;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new HPPrinter();
        printer.print();
        printer.scan();
        printer.copy();

        WashingMachine washer = new SamsungWasher();
        washer.wash();
        washer.rinse();
        washer.spin();

        Drone drone = new Drone();
        drone.fly();
        drone.capture();
        drone.land();

        CoffeeMachine coffeeMachine = new NescafeMachine();
        coffeeMachine.brew();
        coffeeMachine.steamMilk();
        coffeeMachine.clean();

        SmartWatch watch = new Fitbit();
        watch.showTime();
        watch.trackSteps();
        watch.monitorHeartRate();

        Microwave microwave = new LGMicrowave();
        microwave.heat();
        microwave.defrost();
        microwave.setTimer();

        Elevator elevator = new OtisElevator();
        elevator.moveUp();
        elevator.moveDown();
        elevator.stop();

        VacuumCleaner vacuum = new DysonVacuum();
        vacuum.startCleaning();
        vacuum.stopCleaning();
        vacuum.emptyDustbin();

        Blender blender = new PhilipsBlender();
        blender.blend();
        blender.mix();
        blender.cleanBlades();

        Heater heater = new BajajHeater();
        heater.turnOn();
        heater.setTemperature();
        heater.turnOff();
    }
}
