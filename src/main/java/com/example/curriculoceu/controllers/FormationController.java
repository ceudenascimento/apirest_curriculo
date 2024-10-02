package com.example.curriculoceu.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curriculoceu.models.Formation;
import com.example.curriculoceu.services.FormationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/curriculoceu/formacao")
public class FormationController {

    private final FormationService formationService;

    @GetMapping
    public List<Formation> getAll() {
        return formationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formation> getById(@PathVariable Long id) {
        Formation formation = formationService.findById(id);
        return formation != null ? ResponseEntity.ok(formation) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Formation create(@RequestBody Formation formation) {
        return formationService.save(formation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Formation> update(@PathVariable Long id, @RequestBody Formation formation) {
        formation.setFormationid(id);
        Formation updatedFormation = formationService.save(formation);
        return ResponseEntity.ok(updatedFormation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        formationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
