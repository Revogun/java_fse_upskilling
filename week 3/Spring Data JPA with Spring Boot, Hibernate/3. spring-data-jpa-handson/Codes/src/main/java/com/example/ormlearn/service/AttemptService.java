package com.example.ormlearn.service;

import com.example.ormlearn.model.quiz.Attempt;

public interface AttemptService {
    Attempt getAttempt(int userId, int attemptId);
}