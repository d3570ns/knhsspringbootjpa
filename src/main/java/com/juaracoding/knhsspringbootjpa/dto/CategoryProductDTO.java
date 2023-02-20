package com.juaracoding.knhsspringbootjpa.dto;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 15/02/2023 19:56
@Last Modified 15/02/2023 19:56
Version 1.0
*/

public class CategoryProductDTO {

    private Long idCategoryProduct;
    private String nameCategoryProduct;
    private String strDescCategoryProduct;

    public Long getIdCategoryProduct() {
        return idCategoryProduct;
    }

    public void setIdCategoryProduct(Long idCategoryProduct) {
        this.idCategoryProduct = idCategoryProduct;
    }

    public String getNameCategoryProduct() {
        return nameCategoryProduct;
    }

    public void setNameCategoryProduct(String nameCategoryProduct) {
        this.nameCategoryProduct = nameCategoryProduct;
    }

    public String getStrDescCategoryProduct() {
        return strDescCategoryProduct;
    }

    public void setStrDescCategoryProduct(String strDescCategoryProduct) {
        this.strDescCategoryProduct = strDescCategoryProduct;
    }
}