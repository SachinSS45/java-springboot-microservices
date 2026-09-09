package com.sachin.SpringBootWeb.Controllers;

import com.sachin.SpringBootWeb.Repositories.EmployeeRepository;
import com.sachin.SpringBootWeb.dto.EmployeeDTO;
import com.sachin.SpringBootWeb.entities.EmployeeEntity;
import com.sachin.SpringBootWeb.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
        //http://localhost:8080/employees/12
    @GetMapping(path = "/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable(value = "employeeID") Long employeeId){
           return employeeService.getEmployeeById(employeeId);

    }
    //http://localhost:8080/employees?age=25&sortBy=Name
    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //POST api : To add new resource
    @PostMapping
    public EmployeeDTO addNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        return employeeService.addNewEmployee(inputEmployee);
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Emp is updated";
    }
}
