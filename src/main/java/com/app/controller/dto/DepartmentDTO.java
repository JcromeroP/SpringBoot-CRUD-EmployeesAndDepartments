package com.app.controller.dto;

import org.springframework.validation.annotation.Validated;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class DepartmentDTO {

    private String name;

    private String city;
}
