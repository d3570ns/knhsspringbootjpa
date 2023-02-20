package com.juaracoding.knhsspringbootjpa.model;


import com.juaracoding.knhsspringbootjpa.utils.ConstantMessage;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class TugasA {

    @Entity
    @Table(name = "MstTugasA")
    public class MstTugasA implements Serializable {

    @Id
    @Column (name = "IDTugasA", nullable = false)
    private String idTugasA;

    @Length (message = ConstantMessage.WARNING_CATPROD_MAX_LENGTH_NAME, max = 40)
    @Column(name = "Nama",nullable = false,length = 40)
    private String nama;

    @Length(message = ConstantMessage.WARNING_CATPROD_MAX_LENGTH_NAME, max = 500)
    @Column(name = "Alamat",nullable = false,length = 500)
    private String alamat;

    @Column(name = "TanggalLahir",nullable = false)
    private LocalDate tanggalLahir;

    @Column(name = "JenisKelamin",nullable = false,length = 1)
    private char jenisKelamin;

    @Column(name = "MasihHidup",nullable = false)
    private boolean masihHidup;

    /*
    start audit trails
    */
    @Column(name = "CreatedDate", nullable = false)
    private Date createdDate = new Date();

    @Column(name = "CreatedBy", nullable = false)
    private Integer createdBy;

    @Column(name = "ModifiedDate")
    private Date modifiedDate = new Date();

    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete", nullable = false)
    private Byte isDelete;
}
}
