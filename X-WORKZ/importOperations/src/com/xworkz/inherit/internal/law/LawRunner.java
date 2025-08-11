package com.xworkz.inherit.internal.law;

public class LawRunner {
    public static void main(String[]args){
        Law l1=new Law();
        l1.define();
        l1.enforce();
        l1.protectRight();
        l1.resolveDisputes();
        l1.maintainOrder();

        System.out.println("----------");
        Law l=new CyberLaw();
        l.define();
        l.enforce();
        l.protectRight();
        l.resolveDisputes();
        l.maintainOrder();

        System.out.println("-----------");
        CyberLaw cyber=new CyberLaw();
        cyber.define();
        cyber.enforce();
        cyber.protectRight();
        cyber.resolveDisputes();
        cyber.maintainOrder();

        System.out.println("------------");
        Judge judge=new Judge();
        judge.implement(l1);
        judge.implement(l);
        judge.implement(cyber);
    }
}
