package com.app.controller.dto;

import java.time.LocalDate;

import com.app.advice.validation.anotation.ValidAge;
import com.app.advice.validation.anotation.ValidLastName;
import com.app.advice.validation.anotation.ValidName;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @ValidName
    private String name;
    
    @ValidLastName
    private String lastName;

    private String email;

    private Long phone;

    @ValidAge
    private byte age;

    private double height;

    private boolean married;

    private LocalDate dateOfBirth;

    private DepartmentDTO departmentDTO;
}
