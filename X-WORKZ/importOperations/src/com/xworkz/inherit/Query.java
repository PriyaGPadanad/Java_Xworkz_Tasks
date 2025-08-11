package com.xworkz.inherit;

public class Query {
    public Query(){
        System.out.println("Query is superclass");
    }
    public void execute(){
        System.out.println("executing query");
    }
    public void validate(){
        System.out.println("Validating Query");
    }
    public void cancel(){
        System.out.println("Query cancelled");
    }

}
