package com.telusko.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<Integer>nums= Arrays.asList(2,3,4,5);

        Stream<Integer>s1= nums.stream();
        s1.filter(n->n%2==0);

        nums.forEach(n-> System.out.println(n));


//        for(int i=0;i<nums.size();i++){
//            System.out.println(nums.get(i));
//        }

//        int sum=0;
//        for(int n : nums)
//        {
//            if(n%2==0)
//            {
//                n=n*2;
//                sum=sum+n;
//            }
//        }
//
//        System.out.println(nums);
    }
}
