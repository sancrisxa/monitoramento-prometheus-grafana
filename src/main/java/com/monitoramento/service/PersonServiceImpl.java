package com.monitoramento.service;

import com.monitoramento.model.Person;
import com.monitoramento.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepo;

    @Override
    public void save(Person person) {
        personRepo.save(person);
    }
    @Override
    public List<Person> getPersonList() {
        return personRepo.findAll();
    }
}
