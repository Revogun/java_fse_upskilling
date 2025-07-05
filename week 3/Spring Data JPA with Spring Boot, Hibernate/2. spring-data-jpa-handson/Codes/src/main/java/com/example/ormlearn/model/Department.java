package com.example.ormlearn.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dp_id")
    private int id;

    @Column(name = "dp_name")
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Employee> employeeList;
}
