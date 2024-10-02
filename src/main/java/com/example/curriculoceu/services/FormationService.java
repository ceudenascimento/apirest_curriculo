package com.example.curriculoceu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculoceu.models.Formation;
import com.example.curriculoceu.repository.FormationRepository;

import jakarta.transaction.Transactional;

@Service
public class FormationService {

    @Autowired
    private FormationRepository formationRepository;

    @Transactional
    public List<Formation> findAll() {
        return formationRepository.findAll();
    }

    @Transactional
    public Formation findById(Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    @Transactional
    public Formation save(Formation formation) {
        return formationRepository.save(formation);
    }

    @Transactional
    public void deleteById(Long id) {
        formationRepository.deleteById(id);
    }
}
