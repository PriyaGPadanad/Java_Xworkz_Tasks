package com.xworkz.inherit;

public class SQLQuery extends Query{
    public SQLQuery(){
        super();
        System.out.println("SQL Query is subclass");
    }
    public void parse(){
        System.out.println("Parsing sql query");
    }

    public void executeSql(){
        System.out.println("executing sql");
    }
    public void format(){
        System.out.println("formatting sql");
    }

}
