package com.sachin.hospitalmanagmentsystem.services;

import com.sachin.hospitalmanagmentsystem.dto.IPatientInfo;
import com.sachin.hospitalmanagmentsystem.entity.Patient;

import java.util.List;

public interface IPatientService {
    List<Patient> getAllPatients();
    List<IPatientInfo> getAllPatientsInfo();

    void deletePatientById(Long patientId);
}
