package com.monitoramento.service;

import com.monitoramento.model.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);
    List<Person> getPersonList();
}
