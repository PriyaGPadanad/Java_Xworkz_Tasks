package com.xworkz.inherit.internal.finance;

public class Investor {
    public void invest(Finance finance){
        finance.manageMoney();
        finance.assessRisk();
        finance.trackExpenses();
        finance.growWealth();
        finance.planBudget();

        if(finance instanceof MutualFund){
            System.out.println("finance is an instance of MutualFund");
            MutualFund mf=(MutualFund) finance;
            mf.diversifyPortfolio();
        }
    }
}
