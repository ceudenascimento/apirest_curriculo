package com.example.curriculoceu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculoceu.models.Experience;
import com.example.curriculoceu.repository.ExperienceRepository;

import jakarta.transaction.Transactional;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Transactional
    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }

    @Transactional
    public Experience findById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Transactional
    public Experience save(Experience experience) {
        return experienceRepository.save(experience);
    }

    @Transactional
    public void deleteById(Long id) {
        experienceRepository.deleteById(id);
    }
}
