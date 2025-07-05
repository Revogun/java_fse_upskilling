package com.example.ormlearn.model.quiz;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Attempt {
    // ... fields ...

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Date getAttemptedDate() { return attemptedDate; }
    public void setAttemptedDate(Date attemptedDate) { this.attemptedDate = attemptedDate; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public List<AttemptQuestion> getAttemptQuestions() { return attemptQuestions; }
    public void setAttemptQuestions(List<AttemptQuestion> attemptQuestions) { this.attemptQuestions = attemptQuestions; }
}