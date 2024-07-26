package com.app.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data 
@Builder
@AllArgsConstructor
@NoArgsConstructor
//En 1 departamento puede pertenecer muchos empleados
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String name;
    private String city;

    @OneToMany(targetEntity = Employee.class, fetch = FetchType.LAZY, mappedBy = "department")
    private List<Employee> employeeList;

}
