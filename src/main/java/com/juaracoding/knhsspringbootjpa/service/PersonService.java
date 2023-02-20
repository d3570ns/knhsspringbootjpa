package com.juaracoding.knhsspringbootjpa.service;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 13/02/2023 20:03
@Last Modified 13/02/2023 20:03
Version 1.0
*/

import com.juaracoding.knhsspringbootjpa.model.Person;
import com.juaracoding.knhsspringbootjpa.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
@Transactional
public class PersonService  {

    private PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person person){

        List<Person> l = new ArrayList<>();
        List<Person> ll = new LinkedList<>();
        List<Person> lll = new Vector<>();

        Pageable p = null;
        personRepo.save(person);
        personRepo.findAll();
        personRepo.findByFirstName(person.getFirstName());

    }

    public List<Person> findByName(Person person){
        return personRepo.findByFirstName(person.getFirstName());

    }
}



