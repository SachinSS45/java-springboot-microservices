package com.sachin.hospitalmanagmentsystem.repository;

import com.sachin.hospitalmanagmentsystem.dto.BloodGroupStats;
import com.sachin.hospitalmanagmentsystem.dto.CPatientInfo;
import com.sachin.hospitalmanagmentsystem.dto.IPatientInfo;
import com.sachin.hospitalmanagmentsystem.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    List<Patient> findByEmailContaining(String d);
    //to return required fields only not entire entity using proxy objects
    @Query("select p.id as id,p.email as email,p.name as name from Patient p")
    List<IPatientInfo> getAllPatientsInfo();
    //using concrete objects
    @Query("select new com.sachin.hospitalmanagmentsystem.dto.CPatientInfo(p.id,p.name) " +
            "from Patient p")
    List<CPatientInfo> getAllPatientsInfoConcrete();

    @Query("SELECT new com.sachin.hospitalmanagmentsystem.dto.BloodGroupStats(p.bloodGroup," +
            "COUNT(p)) " +
            "FROM Patient p group by p.bloodGroup order by COUNT(p)")
    List<BloodGroupStats> getBloodGroupStats();


    @Modifying
    @Transactional
    @Query("UPDATE Patient  p set p.name=:name where p.id=:id")
    int updatePatientNameWithId(@Param("name") String name,@Param("id") Long id);
}
