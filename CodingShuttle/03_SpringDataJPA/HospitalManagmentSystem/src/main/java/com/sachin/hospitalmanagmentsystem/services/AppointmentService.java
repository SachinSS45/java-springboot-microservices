package com.sachin.hospitalmanagmentsystem.services;

import com.sachin.hospitalmanagmentsystem.entity.Appointment;
import com.sachin.hospitalmanagmentsystem.entity.Doctor;
import com.sachin.hospitalmanagmentsystem.entity.Patient;
import com.sachin.hospitalmanagmentsystem.exceptions.DoctorNotFoundException;
import com.sachin.hospitalmanagmentsystem.exceptions.PatientNotFoundException;
import com.sachin.hospitalmanagmentsystem.repository.AppointmentRepository;
import com.sachin.hospitalmanagmentsystem.repository.DoctorRepository;
import com.sachin.hospitalmanagmentsystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment,Long patientId,Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new PatientNotFoundException("Patient is not present with id " + patientId));
        Doctor doctor   = doctorRepository.findById(doctorId).orElseThrow(()-> new DoctorNotFoundException("Doctor not found with id : " + doctorId));
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);
        return appointment;
    }
}
