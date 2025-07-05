package com.example.ormlearn.service;

import com.example.ormlearn.model.Department;
import com.example.ormlearn.repository.DepartmentRepository;
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
public class DepartmentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    private DepartmentRepository departmentRepository;
@Autowired
private EmployeeService employeeService;

@Autowired
private DepartmentService departmentService;

    @Transactional
    public Department get(int id) {
        LOGGER.info("Start get department");
        return departmentRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Department department) {
        LOGGER.info("Start save department");
        departmentRepository.save(department);
        LOGGER.info("End save department");
    }
    @Transactional
public void testGetDepartment() {
    Department department = get(1);
    LOGGER.debug("Department: {}", department);
    LOGGER.debug("Employees: {}", department.getEmployeeList());
}

}
