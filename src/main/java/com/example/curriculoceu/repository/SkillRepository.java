package com.example.curriculoceu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curriculoceu.models.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{

}
