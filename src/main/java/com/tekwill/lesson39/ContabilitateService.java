package com.tekwill.lesson39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContabilitateService {


    PersonService personService;

    @Autowired
    public ContabilitateService(PersonService personService) {
        this.personService =  new PersonService(new RepositoryDB());
    }

    public void afisarePersoane() {

        personService.getPersons().stream()
                .forEach(System.out::println);
    }


}
