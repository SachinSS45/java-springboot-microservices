package com.sachin.hospitalmanagmentsystem;

import com.sachin.hospitalmanagmentsystem.dto.BloodGroupStats;
import com.sachin.hospitalmanagmentsystem.dto.CPatientInfo;
import com.sachin.hospitalmanagmentsystem.entity.Patient;
import com.sachin.hospitalmanagmentsystem.repository.PatientRepository;
import com.sachin.hospitalmanagmentsystem.services.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;
    @Test
    public void testPatient(){
       // List<CPatientInfo> patientList = patientRepository.getAllPatientsInfoConcrete();
//        List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();
//        for(BloodGroupStats c : patientList){
//            System.out.println(c);
//        }
//        int recordsUpdated = patientRepository.updatePatientNameWithId("Sachin Shetkar", 1L);
//        System.out.println(recordsUpdated);

        patientService.testPatientTransaction();
    }
}
