package com.juaracoding.knhsspringbootjpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {

    private Long idProduct;
    private String nameProduct;
    private CategoryProductDTO categoryProduct;
    private String descriptionProduct;

    public CategoryProductDTO getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(CategoryProductDTO categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

//    public CategoryProductDTO getCategoryProductDTO() {
//        return categoryProductDTO;
//    }
//
//    public void setCategoryProductDTO(CategoryProductDTO categoryProductDTO) {
//        this.categoryProductDTO = categoryProductDTO;
//    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }
}
