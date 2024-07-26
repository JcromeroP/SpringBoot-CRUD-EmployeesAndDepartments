package com.app.services;

import org.springframework.stereotype.Service;

import com.app.controller.dto.EmployeeDTO;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.persistence.EmployeeRepository;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(EmployeeDTO employeeDto) {
        Employee employee = Employee.builder()
                .name(employeeDto.getName())
                .lastName(employeeDto.getLastName())
                .email(employeeDto.getEmail())
                .phone(employeeDto.getPhone())
                .age(employeeDto.getAge())
                .height(employeeDto.getHeight())
                .married(employeeDto.isMarried())
                .dateOfBirth(employeeDto.getDateOfBirth())
                .department(Department.builder()
                        .name(employeeDto.getDepartmentDTO().getName())
                        .city(employeeDto.getDepartmentDTO().getCity())
                        .build())
                .build();
        return this.employeeRepository.save(employee);
    }

}
