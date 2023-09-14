package com.WhizTraining.Hospital;

import com.WhizTraining.patient.AdmittedPatient;
import com.WhizTraining.patient.NewPatient;
import com.WhizTraining.patient.Patient;

public class Hospital {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        Patient P = h.treatPatient("fever");
        System.out.println(P instanceof NewPatient);
        System.out.println(P instanceof AdmittedPatient);
        if(P instanceof NewPatient){
            System.out.println("NewPatient instance created");
        }else if(P instanceof AdmittedPatient){
            System.out.println("AdmittedPatient instance created");
        }
    }

    private Patient treatPatient(String symptoms) {
        //Anything other than fever, Admit
        Patient p = null;
        if(symptoms.equals("fever")){
            //No Admit
            p = new NewPatient();
//            System.out.println(p.getID());
//            System.out.println(p.isAdmitted());
        } else {
            //Admit
            p = new AdmittedPatient();
            p.admitPatient();
//            System.out.println(p.getID());
//            System.out.println(p.isAdmitted());
        }
        return p;
    }
}
