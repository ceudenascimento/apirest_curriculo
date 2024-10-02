package com.example.curriculoceu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculoceu.models.Person;
import com.example.curriculoceu.repository.PersonRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Transactional
    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @Transactional
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Transactional
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
