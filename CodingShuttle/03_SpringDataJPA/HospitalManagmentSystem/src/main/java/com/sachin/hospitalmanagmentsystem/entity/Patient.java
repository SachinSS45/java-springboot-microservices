package com.sachin.hospitalmanagmentsystem.entity;

import com.sachin.hospitalmanagmentsystem.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String gender;
    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
    @CreationTimestamp
    @Column(name = "created_at",updatable = false,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "insurance_id")
    private Insurance insurance;

    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL) //we want to delete appointment if patient is deleted
    private List<Appointment> appointment = new ArrayList<>();//inverse side
}
