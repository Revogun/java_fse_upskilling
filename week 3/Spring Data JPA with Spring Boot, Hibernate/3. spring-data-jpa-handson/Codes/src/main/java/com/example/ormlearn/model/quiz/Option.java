package com.example.ormlearn.model.quiz;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private boolean isCorrect;
    private double score;
    
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}