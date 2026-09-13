package com.sachin.SpringBootWeb.Controllers;

import com.sachin.SpringBootWeb.Repositories.EmployeeRepository;
import com.sachin.SpringBootWeb.dto.EmployeeDTO;
import com.sachin.SpringBootWeb.entities.EmployeeEntity;
import com.sachin.SpringBootWeb.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
        //http://localhost:8080/employees/12
    @GetMapping(path = "/{employeeID}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(value = "employeeID") Long employeeId){
           Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(employeeId);
           return employeeDTO.map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
                   .orElse(ResponseEntity.notFound().build());
    }
    //http://localhost:8080/employees?age=25&sortBy=Name
    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    //POST api : To add new resource
    @PostMapping
    public ResponseEntity<EmployeeDTO> addNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        EmployeeDTO savedEmp =  employeeService.addNewEmployee(inputEmployee);
        return new ResponseEntity<>(savedEmp,HttpStatus.CREATED);
    }

    @PutMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> updateEmployeeById(@PathVariable Long employeeId,@RequestBody EmployeeDTO employeeDTO){
        return ResponseEntity.ok(employeeService.updateEmployeeById(employeeId,employeeDTO));
    }

    @DeleteMapping(path = "/{employeeId}")
    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable Long employeeId){
        boolean ifDeleted = employeeService.deleteEmployeeById(employeeId);
        if(ifDeleted) return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }
    @PatchMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> updatePartialEmployeeById(@RequestBody Map<String,Object> updates,@PathVariable Long employeeId){
        EmployeeDTO employeeDTO = employeeService.updatePartialEmployeeById(updates,employeeId);
        if(employeeDTO==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employeeDTO);
    }

}
