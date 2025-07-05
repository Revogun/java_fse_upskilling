package com.example.ormlearn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
    @ManyToMany(mappedBy = "skillList")
    private List<Employee> employees;
}