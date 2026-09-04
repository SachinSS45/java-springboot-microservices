package com.sachin.SpringBootWeb.Controllers;

import com.sachin.SpringBootWeb.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
@RestController
public class EmployeeController {
        //http://localhost:8080/employees/12
    @GetMapping(path = "/employees/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable(value = "employeeID") Long employeeId){
            return new EmployeeDTO(employeeId,"Sachin","ssshetkar2001@gmail.com",25,LocalDate.of(2023,9,7),true);
    }
    //http://localhost:8080/employees?age=25&sortBy=Name
    @GetMapping(path = "/employees")
    public String getAllEmployees(@RequestParam(required = false) Integer age,@RequestParam(required = false) String sortBy){
        return "Hi age " + age + sortBy;
    }

    //POST api : To add new resource
    @PostMapping
    public EmployeeDTO addNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Emp is updated";
    }
}
