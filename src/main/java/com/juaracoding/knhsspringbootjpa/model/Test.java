package com.juaracoding.knhsspringbootjpa.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MstTest")
public class Test {

    @Id
    @Column(name = "IDTest")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DateTest" , nullable = false)
    private LocalDate dateTest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateTest() {
        return dateTest;
    }

    public void setDateTest(LocalDate dateTest) {
        this.dateTest = dateTest;
    }
}