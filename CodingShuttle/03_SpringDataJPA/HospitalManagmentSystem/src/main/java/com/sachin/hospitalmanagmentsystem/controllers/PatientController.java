package com.sachin.hospitalmanagmentsystem.controllers;

import com.sachin.hospitalmanagmentsystem.dto.IPatientInfo;
import com.sachin.hospitalmanagmentsystem.entity.Patient;
import com.sachin.hospitalmanagmentsystem.services.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final IPatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }
    //We are returning only required fields using Projection
    @GetMapping("/patientInfo")
    public List<IPatientInfo> getAllPatientsInfo(){
        return patientService.getAllPatientsInfo();
    }

    @DeleteMapping("/{patientId}")
    public void deletePatientById(@PathVariable Long patientId){
        patientService.deletePatientById(patientId);
    }
}
