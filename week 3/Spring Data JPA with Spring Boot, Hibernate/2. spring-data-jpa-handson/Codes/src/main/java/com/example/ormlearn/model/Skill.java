package com.example.ormlearn.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "skill")
@Data
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sk_id")
    private int id;

    @Column(name = "sk_name")
    private String name;

    @ManyToMany(mappedBy = "skillList")
    private Set<Employee> employeeList;
}
