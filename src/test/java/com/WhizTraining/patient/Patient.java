package com.WhizTraining.patient;

public interface Patient {

    int getID();
    void setID(int id);
    boolean isAdmitted();
    void admitPatient();
    void diagnosePatient(String symptom);
    void treat(String treatment);

}
