package com.example.employeeapp.dao;

import com.example.employeeapp.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentDao {
    public static List<Department> DEPARTMENT_LIST;

    public DepartmentDao(ApplicationContext context) {
        DEPARTMENT_LIST = (List<Department>) context.getBean("departmentList");
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}

