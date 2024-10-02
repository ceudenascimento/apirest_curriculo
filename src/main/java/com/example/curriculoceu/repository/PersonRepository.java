package com.example.curriculoceu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curriculoceu.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
