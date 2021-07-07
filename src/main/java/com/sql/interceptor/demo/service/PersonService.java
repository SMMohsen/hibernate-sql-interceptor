package com.sql.interceptor.demo.service;

import com.sql.interceptor.demo.model.Person;
import com.sql.interceptor.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public Person getPersonById(Long id) {
        return personRepository.findById(id).get();
    }

    public Person createNewPerson(Person newPerson) {
        return personRepository.save(newPerson);
    }
}
