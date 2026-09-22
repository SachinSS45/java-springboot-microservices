package com.sachin.hospitalmanagmentsystem;

import com.sachin.hospitalmanagmentsystem.entity.Appointment;
import com.sachin.hospitalmanagmentsystem.services.AppointmentService;
import com.sachin.hospitalmanagmentsystem.services.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentServiceTest {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PatientService patientService;

    @Test
    public void testCreateAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,9,23,11,00))
                .reason("cancer")
                .build();
        Appointment appointmentSaved =  appointmentService.createNewAppointment(appointment,1L,2L);
        System.out.println(appointmentSaved);
        patientService.deletePatientById(1L);
    }
}
