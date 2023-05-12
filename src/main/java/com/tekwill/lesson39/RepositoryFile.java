package com.tekwill.lesson39;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class RepositoryFile implements PersonRepository {
    @Override
    public List<Person> getPersons() {

        // citire persoane din fisier

        System.out.println("Quereing persons from File...");
        return null;
    }
}
