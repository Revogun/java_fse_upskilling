package com.example.ormlearn.model.quiz;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AttemptOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "attempt_question_id")
    private AttemptQuestion attemptQuestion;
    
    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
    
    private boolean selected;
}