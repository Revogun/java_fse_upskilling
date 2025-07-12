package com.cognizant.springlearn.spring_rest_demo.model;



import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.util.Date;
import java.util.List;

public class Employee {

    @NotNull
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 30)
    private String name;

    @NotNull
    @Min(0)
    private Double salary;

    @NotNull
    private Boolean permanent;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    @NotNull
    private Department department;

    @NotNull
    private List<Skill> skillList;

    // Getters & Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getPermanent() {
        return permanent;
    }

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Employee(Integer id, List<Skill> skillList, Department department, Date dateOfBirth, Boolean permanent, Double salary, String name) {
        this.id = id;
        this.skillList = skillList;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.permanent = permanent;
        this.salary = salary;
        this.name = name;
    }

    public Employee(Integer id, String name, Double salary, Boolean permanent,
                    Date dateOfBirth, Department department, List<Skill> skillList) {
    }
    public Employee() {

    }


    public void setName(String name) {
        this.name = name;
    }
}

