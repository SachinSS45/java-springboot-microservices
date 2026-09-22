package com.sachin.hospitalmanagmentsystem.exceptions;

public class PatientNotFoundException extends RuntimeException{

    public PatientNotFoundException(String msg){
        super(msg);
    }
}
