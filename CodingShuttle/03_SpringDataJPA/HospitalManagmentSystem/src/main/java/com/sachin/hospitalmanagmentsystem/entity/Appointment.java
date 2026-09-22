package com.sachin.hospitalmanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
//One patient book multiple Appointments but One appointment can't belongs to multiple patients
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;
    //Many appointments can belong to one patient (it means one patient can have many appointment
    @ManyToOne
    @JoinColumn(nullable = false) //to create appointment patient is required
    private Patient patient;//owner side

    @ManyToOne
    @JoinColumn(nullable = false)
    private Doctor doctor;
}
