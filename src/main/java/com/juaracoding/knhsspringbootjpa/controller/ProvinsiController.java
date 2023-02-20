package com.juaracoding.knhsspringbootjpa.controller;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 20/02/2023 12:45
@Last Modified 20/02/2023 12:45
Version 1.0
*/

import com.juaracoding.knhsspringbootjpa.configuration.OtherConfig;
import com.juaracoding.knhsspringbootjpa.handler.ResourceNotFoundException;
import com.juaracoding.knhsspringbootjpa.handler.ResponseHandler;
import com.juaracoding.knhsspringbootjpa.model.CategoryProduct;
import com.juaracoding.knhsspringbootjpa.model.Provinsi;
import com.juaracoding.knhsspringbootjpa.service.ProvinsiService;
import com.juaracoding.knhsspringbootjpa.utils.ConstantMessage;
import com.juaracoding.knhsspringbootjpa.utils.CsvReader;
import com.juaracoding.knhsspringbootjpa.utils.LoggingFile;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

@RestController
@RequestMapping("api/provinsi/")
public class ProvinsiController {
    private ProvinsiService provinsiService;

    private String [] strExceptionArr = new String[2];

    @Autowired
    private ModelMapper modelMapper;

    private Map<String,Object> objectMapper = new HashMap<String,Object>();
    List<Provinsi> lsCPUpload = new ArrayList<Provinsi>();


    @Autowired
    public ProvinsiController(ProvinsiService provinsiService) {
        this.provinsiService = provinsiService;
    }

    @PostMapping("v1/sv")
    public ResponseEntity<Object> saveProvinsi(@Valid
                                               @RequestBody Provinsi provinsi)
    {
        return provinsiService.saveProvinsi(provinsi);
    }


    @PostMapping("/v1/upl/batch")
    public ResponseEntity<Object> uploadCsvMaster(@Valid
                                                  @RequestParam("fileDemo")
                                                  @RequestHeader MultipartFile multipartFile,
                                                  WebRequest request
    ) throws Exception {

        if(CsvReader.isCsv(multipartFile))
        {
            return provinsiService.saveUploadFile(
                    csvToProvinsi(
                            multipartFile.getInputStream()),multipartFile,request);
        }
        else
        {
            return new ResponseHandler().generateResponse(ConstantMessage.ERROR_NOT_CSV_FILE+" -- "+multipartFile.getOriginalFilename(),
                    HttpStatus.NOT_ACCEPTABLE,null,"FI01021",request);
        }

    }

    public List<Provinsi> csvToProvinsi(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        CSVParser csvParser = new CSVParser(bufferedReader,
                CSVFormat.DEFAULT.withFirstRecordAsHeader().
                        withIgnoreHeaderCase()
        );
//        lsCPUpload = new ArrayList<CategoryProduct>();
        lsCPUpload.clear();
        int intCatchErrorRecord = 1;
        try {
            Iterable<CSVRecord> iterRecords = csvParser.getRecords();

            for (CSVRecord record : iterRecords) {
                Provinsi cProvinsi = new Provinsi();
                cProvinsi.setNamaProvinsi(record.get("NamaProvinsi"));
                cProvinsi.setSingkatan(record.get("Singkatan"));
                cProvinsi.setLat(record.get("Latitude"));
                cProvinsi.setLon(record.get("Longitude"));
                cProvinsi.setNamaPemimpin(record.get("NamaPemimpin"));
                cProvinsi.setCreatedBy(record.get("CreatedBy"));
                lsCPUpload.add(cProvinsi);
                intCatchErrorRecord++;
            }

        } catch (Exception ex) {
            strExceptionArr[1]="csvToProvinsiInputStream inputStream) "+ex.getMessage()+" Error Record at Line "+intCatchErrorRecord;
            LoggingFile.exceptionStringz(strExceptionArr,ex, OtherConfig.getFlagLogging());
            throw new Exception(ex.getMessage()+" Error Record at Line "+intCatchErrorRecord);
        }
        finally {
            if (!csvParser.isClosed()) {
                csvParser.close();
            }
        }
        return lsCPUpload;
    }

}