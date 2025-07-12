package com.cognizant.springlearn.jwtdemo.controller;

import com.cognizant.springlearn.jwtdemo.model.Employee;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "John Doe"),
                new Employee(2, "Jane Smith")
        );
    }
}

