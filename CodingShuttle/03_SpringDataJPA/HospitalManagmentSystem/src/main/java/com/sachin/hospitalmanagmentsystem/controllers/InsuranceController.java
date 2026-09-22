package com.sachin.hospitalmanagmentsystem.controllers;

import com.sachin.hospitalmanagmentsystem.entity.Insurance;
import com.sachin.hospitalmanagmentsystem.services.InsuranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insurance")
@RequiredArgsConstructor
public class InsuranceController {


    private final InsuranceService insuranceService;

    @PostMapping("/{id}")
    public void assignInsuranceToPatient(@RequestBody Insurance insurance, @PathVariable Long id){
        insuranceService.assignInsuranceToPatient(insurance,id);
    }
}
