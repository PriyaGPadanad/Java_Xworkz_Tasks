package com.xworkz.exception;

import java.security.acl.LastOwnerException;

public class EventCreator {


    public void checkedEvent() throws LastOwnerException{
        throw new LastOwnerException();
    }

    public void unCheckedEvent() {
        throw new RuntimeException();
    }
}

