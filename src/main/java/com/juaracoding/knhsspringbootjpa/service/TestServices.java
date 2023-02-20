package com.juaracoding.knhsspringbootjpa.service;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 14/02/2023 21:30
@Last Modified 14/02/2023 21:30
Version 1.0
*/

import com.juaracoding.knhsspringbootjpa.model.Test;
import com.juaracoding.knhsspringbootjpa.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TestServices {

    private TestRepo testRepo;


    @Autowired
    public TestServices(TestRepo testRepo) {
        this.testRepo = testRepo;
    }


    public void saveAllTest(List<Test> ls){

        testRepo.saveAll(ls);
    }
}