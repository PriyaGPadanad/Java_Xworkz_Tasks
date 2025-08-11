package com.xworkz.inherit.internal.law;

public class CyberLaw extends Law{
    public CyberLaw(){
        super();
        System.out.println("Running non-arg constructor CyberLaw");
    }
    @Override
    public void define(){
        System.out.println("cyber law defines rules in cyberspace");
    }

    @Override
    public void enforce(){
        System.out.println("Cyber law enforced via cyber police");
    }
    @Override
    public void protectRight(){
        System.out.println("Cyber law protects digital privacy");
    }
    @Override
    public void resolveDisputes(){
        System.out.println("Cyber law resolves online issues");
    }
    @Override
    public void maintainOrder(){
        System.out.println("Cyber law ensures safe digital environment");
    }
    public void handleCyberCrime(){
        System.out.println("New method handleCyberCrime in child");
    }

}
