package com.juaracoding.knhsspringbootjpa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        String[] strExcep = new String[2];
//
//        strExcep[0] = "Main";
//
//        try {
//            int intX = 1 / 0;
//        } catch (Exception e) {
//            strExcep[1] = "main(String[] args) -- LINE 35";
//            LoggingFile.exceptionStringz(strExcep, e, OtherConfig.getFlagLogging());
//        }
    }
}