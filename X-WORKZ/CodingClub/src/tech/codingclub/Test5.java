package tech.codingclub;

import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("This is Priya GP.");
        System.out.println(" Test 5 running at" +new Date().toString()+"sharp.");

        int a=10;
        int b=20;

        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulo:"+(a%b));

        double c=-20.20;

        System.out.println("Math.abs():"+Math.abs(c));

        double d=Math.abs(c); //20.20
        System.out.println("Math.ceil():"+Math.ceil(d)); //21
        System.out.println("Math.floor():"+Math.floor(d)); //20
        System.out.println("Math.min():"+Math.min(2,3));
        System.out.println("Math.max():"+Math.max(2,3));

        System.out.println("Math.random() 0 to 1 :"+Math.random());
        int random=10 +(int) (Math.random()*90);
        System.out.println("Math.random() 10 to 100 :"+random);

        System.out.println("Math.PI :"+Math.PI);

        int e=100;
        System.out.println("Post Increment:"+ e++); //100
        System.out.println("Pre Increment:"+ ++e); //102

        //(username=="admin"&& password=="PASSWORD_FROM_DB")

        int i=1;
        int ans=1;
        while(i<=5){
            ans=ans*i;
            i++;
        }
        System.out.println("5! using while loop:"+ans);
    }
}
