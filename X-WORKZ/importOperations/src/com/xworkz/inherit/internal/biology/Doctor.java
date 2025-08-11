package com.xworkz.inherit.internal.biology;

public class Doctor {
    public void observe(Cell cell){
        cell.function();
        cell.divide();
        cell.absorbNutrients();
        cell.releaseEnergy();
        cell.maintainStructure();

        if(cell instanceof NerveCell){
            System.out.println("cell is an instance of Nerve Cell");
            NerveCell nerve=(NerveCell) cell;
            nerve.transmitSignal();
        }
    }
}
