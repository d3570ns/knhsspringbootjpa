package com.juaracoding.knhsspringbootjpa.model;

import com.juaracoding.knhsspringbootjpa.utils.ConstantMessage;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity
@Table(name = "MstPerson")
public class Person {


    @Id
    @Column(name = "IDPerson")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FirstName", nullable = false,length = 15)
    private String firstName;

    @Column(name = "MiddleName",nullable = true, length = 15)
    private String middleName;

    @Column(name = "LastName",length = 15)
    private String lastName;


    @Column(name = "DayOfBirth")
    private LocalDate dayOfBirth;

    @Transient
    private Integer age;

    @Column(name ="CreatedDate")
    private Date createdDate = new Date();

    @Column(name = "CreatedBy")
    private Integer createdBy;

    @Column(name = "ModifiedDate")
    private Date modifiedDate;

    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete")
    private Byte isDelete = 1;


    public Integer getAge() {
        return Period.
                between(this.dayOfBirth,LocalDate.now())
                .getYears();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

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

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}