package com.cognizant.springlearn.spring_rest_demo.controller;



import com.cognizant.springlearn.spring_rest_demo.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.spring_rest_demo.model.Employee;
import com.cognizant.springlearn.spring_rest_demo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PutMapping
    public void updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException {
        service.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) throws EmployeeNotFoundException {
        service.deleteEmployee(id);
    }
}


