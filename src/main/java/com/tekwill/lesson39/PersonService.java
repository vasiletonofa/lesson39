package com.tekwill.lesson39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonService {

    private RepositoryDB personRepository;

    @Autowired
    public PersonService(RepositoryDB personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        System.out.println("Getting persons..");
        return personRepository.getPersons();
    }

}
