package com.juaracoding.knhsspringbootjpa.controller;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 16/02/2023 20:56
@Last Modified 16/02/2023 20:56
Version 1.0
*/

import com.juaracoding.knhsspringbootjpa.handler.ResponseHandler;
import com.juaracoding.knhsspringbootjpa.model.Test;
import com.juaracoding.knhsspringbootjpa.service.TestServices;
import com.juaracoding.knhsspringbootjpa.utils.ConstantMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestController {


    private TestServices testServices;

    @Autowired
    public TestController(TestServices testServices) {
        this.testServices = testServices;
    }

    @PostMapping("/v1/s")
    public ResponseEntity<Object> saveAll(
            @RequestBody List<Test> listTest
    ){

        testServices.saveAllTest(listTest);

        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_FIND_BY, HttpStatus.OK,null,null,null);

    }
}
