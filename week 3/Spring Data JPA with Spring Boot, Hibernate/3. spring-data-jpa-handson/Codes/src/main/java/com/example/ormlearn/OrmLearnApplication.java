package com.example.ormlearn;

import com.example.ormlearn.model.Employee;
import com.example.ormlearn.model.quiz.*;
import com.example.ormlearn.service.AttemptService;
import com.example.ormlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    
    @Autowired
    EmployeeService employeeService;
    
    @Autowired
    AttemptService attemptService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testGetAllPermanentEmployees();
        testGetAverageSalary();
        testGetAllEmployeesNative();
        testGetAttempt();
    }
    
    public void testGetAllPermanentEmployees() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getAllPermanentEmployees();
        LOGGER.debug("Permanent Employees: {}", employees);
        employees.forEach(e -> LOGGER.debug("Skills: {}", e.getSkillList()));
        LOGGER.info("End");
    }
    
    public void testGetAverageSalary() {
        LOGGER.info("Start");
        double avgSalary = employeeService.getAverageSalary(1);
        LOGGER.debug("Average Salary: {}", avgSalary);
        LOGGER.info("End");
    }
    
    public void testGetAllEmployeesNative() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getAllEmployeesNative();
        LOGGER.debug("Employees: {}", employees);
        LOGGER.info("End");
    }
    
    public void testGetAttempt() {
        LOGGER.info("Start");
        Attempt attempt = attemptService.getAttempt(1, 1);
        if (attempt != null) {
            LOGGER.debug("Attempt Date: {}", attempt.getAttemptedDate());
            LOGGER.debug("Username: {}", attempt.getUser().getUsername());
            
            for (AttemptQuestion aq : attempt.getAttemptQuestions()) {
                LOGGER.debug("Question: {}", aq.getQuestion().getText());
                
                for (AttemptOption ao : aq.getAttemptOptions()) {
                    Option option = ao.getOption();
                    LOGGER.debug("{}) {} \t {} \t {}", 
                        option.getId(), 
                        option.getText(), 
                        option.getScore(),
                        ao.isSelected());
                }
            }
        }
        LOGGER.info("End");
    }
}