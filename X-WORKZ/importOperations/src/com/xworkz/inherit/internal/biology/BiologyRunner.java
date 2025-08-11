package com.xworkz.inherit.internal.biology;

public class BiologyRunner{
    public static void main(String[] args){
        Cell c1=new Cell();
        c1.function();
        c1.divide();
        c1.absorbNutrients();
        c1.releaseEnergy();
        c1.maintainStructure();

        System.out.println("-------");
        Cell c=new NerveCell();
        c.function();
        c.divide();
        c.absorbNutrients();
        c.releaseEnergy();
        c.maintainStructure();

        System.out.println("------");
        NerveCell nerve=new NerveCell();
        nerve.function();
        nerve.divide() ;
        nerve.absorbNutrients();
        nerve.releaseEnergy();
        nerve.maintainStructure();

        System.out.println("---------");
        Doctor doc=new Doctor();
        doc.observe(c1);
        doc.observe(c);
        doc.observe(nerve);
        }
    }

