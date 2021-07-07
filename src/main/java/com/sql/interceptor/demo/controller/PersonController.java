package com.sql.interceptor.demo.controller;


import com.sql.interceptor.demo.model.Person;
import com.sql.interceptor.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    
    @Autowired
    private PersonService personService;
    
    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/person")
    public Person createNewPerson(@RequestBody Person newPerson) {
        return personService.createNewPerson(newPerson);
    }
}
