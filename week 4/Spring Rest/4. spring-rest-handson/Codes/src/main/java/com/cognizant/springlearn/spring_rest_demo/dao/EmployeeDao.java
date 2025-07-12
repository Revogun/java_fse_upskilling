package com.cognizant.springlearn.spring_rest_demo.dao;



import com.cognizant.springlearn.spring_rest_demo.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.spring_rest_demo.model.Department;
import com.cognizant.springlearn.spring_rest_demo.model.Employee;
import com.cognizant.springlearn.spring_rest_demo.model.Skill;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeDao {
    private static List<Employee> EMPLOYEES = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return EMPLOYEES;
    }

    public void updateEmployee(Employee updated) throws EmployeeNotFoundException {
        boolean found = false;
        for (int i = 0; i < EMPLOYEES.size(); i++) {
            if (EMPLOYEES.get(i).getId().equals(updated.getId())) {
                EMPLOYEES.set(i, updated);
                found = true;
                break;
            }
        }
        if (!found) throw new EmployeeNotFoundException("Employee with ID " + updated.getId() + " not found.");
    }

    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        boolean removed = EMPLOYEES.removeIf(emp -> emp.getId() == id);
        if (!removed) throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
    }

    @PostConstruct
    public void init() {
        Employee emp = new Employee(1, "John", 50000.0, true, new Date(),
                new Department(1, "HR"), List.of(new Skill(1, "Java")));
        EmployeeDao.EMPLOYEES.add(emp);
    }
}
