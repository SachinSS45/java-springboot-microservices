package com.sachin.hospitalmanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

    @Column(nullable = false,length = 100)
    private String specialization;

    @Column(nullable = false,unique = true,length = 100)
    private String email;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments = new ArrayList<>();
}
