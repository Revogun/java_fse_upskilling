package com.example.ormlearn.service;

import com.example.ormlearn.model.Skill;
import com.example.ormlearn.repository.SkillRepository;
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

@Autowired
private EmployeeService employeeService;

@Service
public class SkillService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkillService.class);

    @Autowired
    private SkillRepository skillRepository;
@Autowired
private EmployeeService employeeService;

@Autowired
private DepartmentService departmentService;

    @Transactional
    public Skill get(int id) {
        LOGGER.info("Start get skill");
        return skillRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Skill skill) {
        LOGGER.info("Start save skill");
        skillRepository.save(skill);
        LOGGER.info("End save skill");
    }
    @Transactional
public void testAddSkillToEmployee() {
    Employee emp = employeeService.get(1);
    Skill skill = get(1);
    emp.getSkillList().add(skill);
    employeeService.save(emp);
    LOGGER.debug("Added Skill to Employee: {}", emp.getSkillList());
}

}
