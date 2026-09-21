package com.sachin.hospitalmanagmentsystem.services;

import com.sachin.hospitalmanagmentsystem.dto.IPatientInfo;
import com.sachin.hospitalmanagmentsystem.entity.Patient;
import com.sachin.hospitalmanagmentsystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
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

    public void testPatientTransaction(){
        Patient p1 = patientRepository.findById(1L).orElseThrow();
        Patient p2 = patientRepository.findById(1L).orElseThrow();
        //there will two calls to db for same id
        System.out.println(p1 + " " + p2);
        System.out.println(p1==p2);//false
    }

    //now if I use transactional context see : all the operations will happen in same persistence context
    @Transactional
    public void testPatientTransaction2(){
        Patient p1 = patientRepository.findById(1L).orElseThrow();//it is not present in persisitence context so it will add that in
        //in persistence context

        //now it will check in persistence context is it already present yes then it will use that only it will not call again to db
        Patient p2 = patientRepository.findById(1L).orElseThrow();

        //there will two calls to db for same id
        System.out.println(p1 + " " + p2);
        System.out.println(p1==p2);//true
    }

}
