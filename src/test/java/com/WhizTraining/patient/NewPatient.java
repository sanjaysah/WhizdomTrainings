package com.WhizTraining.patient;

import java.util.Random;

public class NewPatient implements Patient{

    public int id;
    public String diagnose;
    public String treatment;
    public boolean isAdmitted;

    public NewPatient(){
        System.out.println("New patient");
        id = new Random().nextInt(100); //bw 0-99
        isAdmitted=false;
    }
    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public boolean isAdmitted() {
        return isAdmitted;
    }

    @Override
    public void admitPatient() {
        //Blank
    }

    @Override
    public void diagnosePatient(String symptom){

    }

    @Override
    public void treat(String treatment){

    }
}
