package com.cognizant.springlearn.spring_rest_demo.service;



import com.cognizant.springlearn.spring_rest_demo.dao.EmployeeDao;
import com.cognizant.springlearn.spring_rest_demo.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.spring_rest_demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao dao;

    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        dao.updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        dao.deleteEmployee(id);
    }
}
