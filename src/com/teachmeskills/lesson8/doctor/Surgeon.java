package com.teachmeskills.lesson8.doctor;

import com.teachmeskills.lesson8.ICure;

public class Surgeon implements ICure {
    @Override
    public void doCure() {
        System.out.println("Do a surgery");
    }
}
