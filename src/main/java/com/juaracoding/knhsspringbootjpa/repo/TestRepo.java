package com.juaracoding.knhsspringbootjpa.repo;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 14/02/2023 21:29
@Last Modified 14/02/2023 21:29
Version 1.0
*/

import com.juaracoding.knhsspringbootjpa.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test,Long> {

}