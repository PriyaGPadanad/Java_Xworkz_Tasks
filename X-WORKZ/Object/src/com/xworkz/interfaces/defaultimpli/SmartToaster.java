package com.xworkz.interfaces.defaultimpli;

import com.xworkz.string.internal.Toaster;

public class SmartToaster extends Toaster {
    @Override
    public void toast(){
        System.out.println("SmartToaster:Custom toasting with crisp level");
    }
}
