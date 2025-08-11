package tech.codingclub;

import java.util.Date;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("This is Priya GP.");
        System.out.println(" Test 2 running at" +new Date().toString()+"sharp.");

        byte a=1;  // 1 byte
        short b=3;  //2 byte -127 127
        int c=5;     //4 byte
        long d=7;    //8 byte

        boolean e=true;  //false
        char f='a';        //2 byte

        float g=9.0f; //4  byte
        double h=10.4; //8 byte

        System.out.println(a+":"+b+":"+c+":"+d+":"+e+":"+f+":"+g+":"+h);
    }
}
