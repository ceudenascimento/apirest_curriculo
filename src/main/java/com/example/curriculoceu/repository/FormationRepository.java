package com.example.curriculoceu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curriculoceu.models.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
