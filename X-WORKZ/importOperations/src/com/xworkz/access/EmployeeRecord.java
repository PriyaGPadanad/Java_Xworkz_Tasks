package com.xworkz.access;

import java.sql.SQLOutput;

public class EmployeeRecord {
    public String employeeName="John Doe";
    int employeeId=12345;
    private double salary =50000.00;
    public void displayEmployeeDetails(){
        System.out.println("Employee Name:"+employeeName);
        displayEmployeeId();
        calculateBonus();
    }
    void displayEmployeeId(){
        System.out.println("Employee ID:" +employeeId);
    }

    private void calculateBonus(){
        double bonus=salary*0.10;
        System.out.println("Bonus:"+bonus);
    }

    public static void main(String[] args){
        EmployeeRecord record=new EmployeeRecord();
        record.displayEmployeeDetails();

        System.out.println("Employee Name(public):"+record.employeeName);
        System.out.println("Employee ID(package-private):"+record.employeeId);
    }

}