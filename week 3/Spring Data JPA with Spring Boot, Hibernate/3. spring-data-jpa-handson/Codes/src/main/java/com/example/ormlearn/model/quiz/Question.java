package com.example.ormlearn.model.quiz;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private double score;
    
    @OneToMany(mappedBy = "question")
    private List<Option> options;
}