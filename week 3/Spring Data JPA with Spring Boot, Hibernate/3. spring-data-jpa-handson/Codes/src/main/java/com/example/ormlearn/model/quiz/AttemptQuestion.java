package com.example.ormlearn.model.quiz;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class AttemptQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "attempt_id")
    private Attempt attempt;
    
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    
    @OneToMany(mappedBy = "attemptQuestion")
    private List<AttemptOption> attemptOptions;
}