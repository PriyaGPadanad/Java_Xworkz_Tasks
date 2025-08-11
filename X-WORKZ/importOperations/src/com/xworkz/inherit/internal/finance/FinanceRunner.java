package com.xworkz.inherit.internal.finance;

public class FinanceRunner {
    public static void main(String[]args){
        Finance f1=new Finance();
        f1.manageMoney();
        f1.assessRisk();
        f1.trackExpenses();
        f1.growWealth();
        f1.planBudget();

        System.out.println("---------");
        Finance f=new MutualFund();
        f.manageMoney();
        f.assessRisk();
        f.trackExpenses();
        f.growWealth();
        f.planBudget();

        System.out.println("----------");
        MutualFund mf=new MutualFund();
        mf.manageMoney();
        mf.assessRisk();
        mf.trackExpenses();
        mf.growWealth();
        mf.planBudget();

        System.out.println("______casting example________");
        Investor inv=new Investor();
        inv.invest(f1);
        inv.invest(f);
        inv.invest(mf);

    }
}
