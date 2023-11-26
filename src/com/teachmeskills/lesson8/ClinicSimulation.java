package com.teachmeskills.lesson8;

/*Create a program to simulate the work of a clinic.
Let there be three doctors in the clinic: a surgeon, a therapist and a dentist.
Every doctor has a method of “treating,” but every doctor treats differently.
Also provide a “Patient” class with a “Treatment Plan” field and a “Doctor” field.
Create an object of the “Patient” class and add a treatment plan to the patient.
The therapist will create a method that will prescribe a doctor to the patient according to the plan
treatment:
If the treatment plan has code 1, appoint a surgeon and perform the treatment method.
If the treatment plan has code 2, appoint a dentist and perform the treatment method.
If the treatment plan has any other code, assign a therapist and perform the method
treat.

 */

import com.teachmeskills.lesson8.doctor.Therapist;

public class ClinicSimulation {
    public static void main(String[] args) {
        int count = 1;
        Therapist therapist = new Therapist();

        Patient[] patients = new Patient[5];
        patients[0] = new Patient(1);
        patients[1] = new Patient(2);
        patients[2] = new Patient(3);
        patients[3] = new Patient(4);
        patients[4] = new Patient(0);


            for (Patient patient: patients) {
                ICure patientCase = therapist.doctor(patient.curePlan);
                System.out.print("Patient №" + count + " will be prescribed this treatment: \n");
                patientCase.doCure();
                System.out.println();
                count++;
            }
    }
}
