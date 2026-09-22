package com.sachin.hospitalmanagmentsystem.repository;

import com.sachin.hospitalmanagmentsystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}