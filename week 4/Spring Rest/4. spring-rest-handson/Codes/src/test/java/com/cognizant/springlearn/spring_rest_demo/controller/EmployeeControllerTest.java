package com.cognizant.springlearn.spring_rest_demo.controller;

import com.cognizant.springlearn.spring_rest_demo.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.spring_rest_demo.model.*;
import com.cognizant.springlearn.spring_rest_demo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testUpdateEmployee_InvalidField_ShouldReturn400() throws Exception {
        Employee emp = new Employee();
        emp.setId(null);
        emp.setName("John");
        emp.setSalary(50000.0);
        emp.setPermanent(true);
        emp.setDateOfBirth(new Date());
        emp.setDepartment(new Department(1, "IT"));
        emp.setSkillList(List.of(new Skill(1, "Java")));

        String empJson = objectMapper.writeValueAsString(emp);

        mockMvc.perform(put("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(empJson))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.errors").exists());
    }

    @Test
    void testUpdateEmployee_NotFound_ShouldReturn404() throws Exception {
        Employee emp = new Employee(99, "Ghost", 70000.0, true,
                new Date(),
                new Department(1, "HR"),
                List.of(new Skill(1, "Nothing")));

        String empJson = objectMapper.writeValueAsString(emp);

        Mockito.doThrow(new EmployeeNotFoundException("Employee not found"))
                .when(employeeService).updateEmployee(Mockito.any(Employee.class));

        mockMvc.perform(put("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(empJson))
                .andExpect(status().isNotFound())
                .andExpect(status().reason("Employee Not Found"));
    }

    @Test
    void testDeleteEmployee_NotFound_ShouldReturn404() throws Exception {
        Mockito.doThrow(new EmployeeNotFoundException("Not found"))
                .when(employeeService).deleteEmployee(404);

        mockMvc.perform(delete("/employees/404"))
                .andExpect(status().isNotFound())
                .andExpect(status().reason("Employee Not Found"));
    }
}
