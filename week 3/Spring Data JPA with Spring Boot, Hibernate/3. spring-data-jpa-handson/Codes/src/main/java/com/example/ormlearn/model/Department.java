package com.example.ormlearn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employeeList;
}