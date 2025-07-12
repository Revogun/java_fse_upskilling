package com.cognizant.springlearn.spring_rest_demo.model;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Department {

    @NotNull
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 30)
    private String name;

    public Department() {
    }

    public Department(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Department(int i, String hr) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Getters & Setters
}

