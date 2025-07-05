package com.example.ormlearn.service;

import com.example.ormlearn.model.Employee;
import com.example.ormlearn.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

import com.example.ormlearn.model.Employee;
import com.example.ormlearn.model.Department;
import com.example.ormlearn.model.Skill;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;
@Autowired
private EmployeeService employeeService;

@Autowired
private DepartmentService departmentService;

    @Transactional
    public Employee get(int id) {
        LOGGER.info("Start get employee");
        return employeeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Employee employee) {
        LOGGER.info("Start save employee");
        employeeRepository.save(employee);
        LOGGER.info("End save employee");
    }
    @Transactional
public void testGetEmployee() {
    Employee employee = get(1);
    LOGGER.debug("Employee: {}", employee);
    LOGGER.debug("Department: {}", employee.getDepartment());
    LOGGER.debug("Skills: {}", employee.getSkillList());
}

@Transactional
public void testAddEmployee() {
    Employee employee = new Employee();
    employee.setName("New Emp");
    employee.setSalary(90000);
    employee.setPermanent(true);
    employee.setDateOfBirth(new Date());

    Department dept = departmentService.get(1);
    employee.setDepartment(dept);

    save(employee);
    LOGGER.debug("Saved Employee: {}", employee);
}

@Transactional
public void testUpdateEmployee() {
    Employee emp = get(1);
    Department newDept = departmentService.get(2);
    emp.setDepartment(newDept);
    save(emp);
    LOGGER.debug("Updated Employee: {}", emp);
}

}
