package com.sachin.SpringBootWeb.dto;


import com.sachin.SpringBootWeb.Annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long id;
    @NotBlank(message = "Name of Employee can't be blank")
    @Size(min=3,max = 10,message = "Number of characters in name in range 3 and 10")
    private String name;

    @NotBlank(message = "Email of the employee can't be blank")
    @Email
    private String email;

    @NotNull(message = "Employee age can't be null")
    @Max(value=58,message = "Employee age can't be greater than 58")
    @Min(value=18,message = "Employee age can't be less than 18")
    private Integer age;

    @NotBlank(message = "Role of the employee can't be blank")
    //@Pattern(regexp = "^(ADMIN|USER)$",message = "Role of employee can either be ADMIN or USER")
    @EmployeeRoleValidation
    private String role;

    @NotNull(message = "Salary of employee should not be null")
    @Positive(message = "Salary should be positive")
    @Digits(integer = 6,fraction = 2,message = "The salary can be in the form xxxx.yy")
    @DecimalMax(value = "100000.99",message = "salary can't be more than 100000.99")
    @DecimalMin(value = "100.99",message = "salary can't be less than 100.99")
    private Double salary;
    @PastOrPresent(message = "DateOfJoining in Employee can't be in future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be Active")
    private Boolean isActive;

    public EmployeeDTO(Long id, String name, String email, Integer age, String role, Double salary, LocalDate dateOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public EmployeeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }
}
