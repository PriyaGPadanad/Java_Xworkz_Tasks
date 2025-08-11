package com.xworkz.inherit.internal.finance;

public class MutualFund extends Finance{
    public MutualFund(){
        super();
        System.out.println("Running non-arg constructor MutualFund");
    }
    @Override
    public void manageMoney(){
        System.out.println("MutualFund manages pooled money from investors");
    }
    @Override
    public void assessRisk(){
        System.out.println("MutualFund assesses portfolio risk");
    }
    @Override
    public void trackExpenses(){
        System.out.println("MutualFund tracks fund operation costs");
    }
    @Override
    public void growWealth(){
        System.out.println("MutualFund helps in capital appreciation");
    }
    @Override
    public void planBudget(){
        System.out.println("MutualFund allocates assets according to plan");
    }

    public void diversifyPortfolio(){
        System.out.println("New method diversifyPortfolio in child class");
    }
}
