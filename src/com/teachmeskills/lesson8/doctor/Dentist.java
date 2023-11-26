package com.teachmeskills.lesson8.doctor;

import com.teachmeskills.lesson8.ICure;

public class Dentist implements ICure {
    @Override
    public void doCure() {
        System.out.println("Treat toothache");
    }
}
