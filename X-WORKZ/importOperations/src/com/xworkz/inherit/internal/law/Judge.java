package com.xworkz.inherit.internal.law;

public class Judge {
    public void implement(Law law){
        law.define();
        law.enforce();
        law.protectRight();
        law.resolveDisputes();
        law.maintainOrder();

        if(law instanceof CyberLaw){
            System.out.println("law is an instance of CyberLaw");
            CyberLaw cyber=(CyberLaw)law;
            cyber.handleCyberCrime();
        }

    }
}
