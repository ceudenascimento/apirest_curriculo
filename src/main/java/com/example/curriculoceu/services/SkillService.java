package com.example.curriculoceu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculoceu.models.Skill;
import com.example.curriculoceu.repository.SkillRepository;

import jakarta.transaction.Transactional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Transactional
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Transactional
    public Skill findById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Transactional
    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }

    @Transactional
    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }
}
