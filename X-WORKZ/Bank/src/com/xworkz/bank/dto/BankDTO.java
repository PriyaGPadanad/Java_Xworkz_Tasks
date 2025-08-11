package com.xworkz.bank.dto;

import java.io.Serializable;

public class BankDTO implements Serializable {

    private String name;

    private String accno;


    public BankDTO(String name, String accno){
        this.name=name;
        this.accno=accno;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Override
    public String toString() {
        return "BankDTO{" +
                "name='" + name + '\'' +
                ", accno='" + accno + '\'' +
                '}';
    }
}
