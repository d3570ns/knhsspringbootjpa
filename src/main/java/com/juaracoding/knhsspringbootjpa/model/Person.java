package com.juaracoding.knhsspringbootjpa.model;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 09/02/2023 20:41
@Last Modified 09/02/2023 20:41
Version 1.0
*/

import javax.persistence.*;

@Entity
@Table(name = "MstPerson")
public class Person {

    @Id
    @Column(name = "IDPerson")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "MiddleName")
    private String middleName;

    @Column(name = "LastName")
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}