package com.example.ormlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ormlearn.model.Country;
import com.example.ormlearn.repository.CountryRepository;
import java.util.Date;

import com.example.ormlearn.model.Employee;
import com.example.ormlearn.model.Department;
import com.example.ormlearn.model.Skill;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    @Autowired
    private CountryRepository countryRepository;
@Autowired
private EmployeeService employeeService;

@Autowired
private DepartmentService departmentService;

    public void searchCountriesContaining(String text) {
        LOGGER.info("Search countries containing: {}", text);
        List<Country> list = countryRepository.findByNameContainingOrderByNameAsc(text);
        list.forEach(c -> LOGGER.info("{} - {}", c.getCode(), c.getName()));
    }

    public void searchCountriesStartingWith(String prefix) {
        LOGGER.info("Search countries starting with: {}", prefix);
        List<Country> list = countryRepository.findByNameStartingWith(prefix);
        list.forEach(c -> LOGGER.info("{} - {}", c.getCode(), c.getName()));
    }
}
