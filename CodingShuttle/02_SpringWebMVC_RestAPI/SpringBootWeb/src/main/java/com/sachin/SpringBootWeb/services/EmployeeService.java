package com.sachin.SpringBootWeb.services;

import com.sachin.SpringBootWeb.Repositories.EmployeeRepository;
import com.sachin.SpringBootWeb.dto.EmployeeDTO;
import com.sachin.SpringBootWeb.entities.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long employeeId) {
         EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).orElse(null);
         //Map EmployeeEntity to EmployeeDTO
         return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        //we need to map every EmployeeEntity to EmployeeDTO to send back all EmployeeEntity as EmployeeDTO
        return employeeEntities.stream()
                .map(e -> modelMapper.map(e, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO addNewEmployee(EmployeeDTO inputEmployee) {
        //Map DTO to Entity
        EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee,EmployeeEntity.class);
        EmployeeEntity employeeEntity = employeeRepository.save(toSaveEntity);
        //Map Entity to DTO again to send back reponse
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }
}
