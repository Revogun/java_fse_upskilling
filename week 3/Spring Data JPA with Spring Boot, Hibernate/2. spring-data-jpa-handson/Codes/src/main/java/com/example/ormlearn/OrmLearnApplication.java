package com.example.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.ormlearn.service.CountryService;
import com.example.ormlearn.service.StockService;
import com.example.ormlearn.service.EmployeeService;
import com.example.ormlearn.service.DepartmentService;
import com.example.ormlearn.service.SkillService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private StockService stockService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private SkillService skillService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Starting OrmLearn Application");

        // Uncomment to run desired test cases
         countryService.searchCountriesContaining("ou");
         stockService.getFacebookStockInSeptember2019();
         employeeService.testGetEmployee();
        employeeService.testAddEmployee();
         employeeService.testUpdateEmployee();
         departmentService.testGetDepartment();
         skillService.testAddSkillToEmployee();

        LOGGER.info("Completed OrmLearn Application Execution");
    }
}
