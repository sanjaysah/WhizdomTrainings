package com.WhizTraining.patient;

public class AdmittedPatient implements Patient{

    public AdmittedPatient(){
        //Parent constructor first called
        System.out.println("Admitted Patient");
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }

    @Override
    public boolean isAdmitted() {
        return false;
    }

    @Override
    public void admitPatient() {
        //Code
    }

    @Override
    public void diagnosePatient(String symptom) {

    }

    @Override
    public void treat(String treatment) {

    }
}
