//package com.sachin.hospitalmanagmentsystem.services;
//
//import com.sachin.hospitalmanagmentsystem.entity.Insurance;
//import com.sachin.hospitalmanagmentsystem.entity.Patient;
//import com.sachin.hospitalmanagmentsystem.exceptions.PatientNotFoundException;
//import com.sachin.hospitalmanagmentsystem.repository.InsuranceRepository;
//import com.sachin.hospitalmanagmentsystem.repository.PatientRepository;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class InsuranceService {
//
//    private final InsuranceRepository insuranceRepository;
//    private final PatientRepository patientRepository;
//
//    @Transactional
//    public void assignInsuranceToPatient(Insurance insurance,Long patientId){
//        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new PatientNotFoundException("Patient not found with id : " + patientId));
//        insuranceRepository.save(insurance);
//        patient.setInsurance(insurance);//because patient is owning table here
//        insurance.setPatient(patient);//optional
//    }
//}
