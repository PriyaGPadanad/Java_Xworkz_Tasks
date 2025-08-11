package com.xworkz.inheritance.hierarchical.ex5;

public class AccountRunner {
    public static void main(String[] args){
        AdminAccount admin=new AdminAccount();
        admin.login();
        admin.manageUsers();

        UserAccount user=new UserAccount();
        user.viewDashboard();
        user.login();
    }
}
