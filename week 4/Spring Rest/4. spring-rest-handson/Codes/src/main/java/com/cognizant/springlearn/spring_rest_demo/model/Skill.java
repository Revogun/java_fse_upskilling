package com.cognizant.springlearn.spring_rest_demo.model;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Skill {

    @NotNull
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 30)
    private String name;

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Skill(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Skill(int id, String name) {
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
