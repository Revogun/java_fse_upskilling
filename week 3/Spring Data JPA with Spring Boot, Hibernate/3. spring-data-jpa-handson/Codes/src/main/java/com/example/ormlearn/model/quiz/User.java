package com.example.ormlearn.model.quiz;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    
    @OneToMany(mappedBy = "user")
    private List<Attempt> attempts;
}