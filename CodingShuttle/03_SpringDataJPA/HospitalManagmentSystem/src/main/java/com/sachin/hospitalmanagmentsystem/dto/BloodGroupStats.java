package com.sachin.hospitalmanagmentsystem.dto;

import com.sachin.hospitalmanagmentsystem.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;//How many people with above bloodGroup
}
