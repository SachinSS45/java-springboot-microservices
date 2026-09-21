package com.sachin.hospitalmanagmentsystem.services;

import com.sachin.hospitalmanagmentsystem.dto.IPatientInfo;
import com.sachin.hospitalmanagmentsystem.entity.Patient;
import com.sachin.hospitalmanagmentsystem.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService{

    private final PatientRepository patientRepository;
    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<IPatientInfo> getAllPatientsInfo() {
        return patientRepository.getAllPatientsInfo();
    }

}
