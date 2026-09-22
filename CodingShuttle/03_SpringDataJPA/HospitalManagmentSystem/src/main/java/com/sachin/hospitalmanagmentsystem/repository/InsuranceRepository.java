package com.sachin.hospitalmanagmentsystem.repository;

import com.sachin.hospitalmanagmentsystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Long> {
}
