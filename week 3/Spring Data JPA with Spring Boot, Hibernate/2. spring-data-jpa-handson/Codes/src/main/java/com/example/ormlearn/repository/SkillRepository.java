package com.example.ormlearn.repository;

import com.example.ormlearn.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
