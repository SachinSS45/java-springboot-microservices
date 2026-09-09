package com.sachin.SpringBootWeb.Controllers;

import com.sachin.SpringBootWeb.Repositories.EmployeeRepository;
import com.sachin.SpringBootWeb.dto.EmployeeDTO;
import com.sachin.SpringBootWeb.entities.EmployeeEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
        //http://localhost:8080/employees/12
    @GetMapping(path = "/{employeeID}")
    public EmployeeEntity getEmployeeById(@PathVariable(value = "employeeID") Long employeeId){
           return employeeRepository.findById(employeeId).orElse(null);
    }
    //http://localhost:8080/employees?age=25&sortBy=Name
    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age, @RequestParam(required = false) String sortBy){
        return employeeRepository.findAll();
    }

    //POST api : To add new resource
    @PostMapping
    public EmployeeEntity addNewEmployee(@RequestBody EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Emp is updated";
    }
}
