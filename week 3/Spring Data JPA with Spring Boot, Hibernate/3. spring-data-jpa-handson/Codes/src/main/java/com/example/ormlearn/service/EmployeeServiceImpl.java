package com.example.ormlearn.service.impl;

import com.example.ormlearn.model.Employee;
import com.example.ormlearn.repository.EmployeeRepository;
import com.example.ormlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllPermanentEmployees() {
        return employeeRepository.getAllPermanentEmployees();
    }

    @Override
    public double getAverageSalary(int id) {
        return employeeRepository.getAverageSalary(id);
    }

    @Override
    public List<Employee> getAllEmployeesNative() {
        return employeeRepository.getAllEmployeesNative();
    }
}