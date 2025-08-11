package com.xworkz.lambda;

public class CustomerRunner {
    public static void main(String... args) {

//        Bottle bottle=(int no)->{           //defining parameter data type is optional
//            System.out.println("Running lambda implementation "+no);
//            if (no>0){
//                return true;
//            }
//            return false;
//        };

        Customer customer=new Customer();
        customer.buy((no) -> no>100);
    }
}
