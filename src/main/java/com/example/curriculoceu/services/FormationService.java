package com.example.curriculoceu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculoceu.models.Formation;
import com.example.curriculoceu.repository.FormationRepository;

@Service
public class FormationService {

    @Autowired
    private FormationRepository formationRepository;

    public List<Formation> findAll() {
        return formationRepository.findAll();
    }

    public Formation findById(Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    public Formation save(Formation formation) {
        return formationRepository.save(formation);
    }

    public void deleteById(Long id) {
        formationRepository.deleteById(id);
    }
}
