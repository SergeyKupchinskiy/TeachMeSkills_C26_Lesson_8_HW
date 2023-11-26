package com.teachmeskills.lesson8.doctor;

import com.teachmeskills.lesson8.ICure;

public class Therapist implements ICure {

    public ICure doctor(int numberOfDoctor){
        if (numberOfDoctor == 1){
            return new Surgeon();
        } else if (numberOfDoctor == 2) {
            return new Dentist();
        } else {
            return new Therapist();
        }
    }
    @Override
    public void doCure() {
        System.out.println("Write out sick leave for a week");
    }
}
