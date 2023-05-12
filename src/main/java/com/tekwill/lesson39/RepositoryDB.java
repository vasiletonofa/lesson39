package com.tekwill.lesson39;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositoryDB implements PersonRepository { // SpringContext  -> Singleton
    @Override
    public List<Person> getPersons() {

        // citire persoane din DB

        System.out.println("Quering persons from DB");

        return null;
    }
}
