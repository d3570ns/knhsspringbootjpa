package com.juaracoding.knhsspringbootjpa.repo;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 13/02/2023 20:41
@Last Modified 13/02/2023 20:41
Version 1.0
*/

import com.juaracoding.knhsspringbootjpa.model.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryProductRepo extends JpaRepository<CategoryProduct,Long> {


//    List<CategoryProduct> findByNameCategoryProduct(String value);

    /*
        findByNameCategoryProduct
        SELECT * FROM MstCategoryProduct WHERE NameCategoryProduct = ?
    */
}
