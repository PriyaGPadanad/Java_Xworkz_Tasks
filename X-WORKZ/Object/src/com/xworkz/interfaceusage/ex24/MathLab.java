package com.xworkz.interfaceusage.ex24;

public class MathLab {
    private Calculator calculator;
    public MathLab(Calculator calculator){
        this.calculator=calculator;
    }
    public void solveProblem(){
        calculator.calculate();
    }
}
