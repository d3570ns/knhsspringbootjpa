package com.juaracoding.knhsspringbootjpa.controller;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public class SupplierController {



    private Map<String,Object> transformObject(Map<String,Object> mapz, List ls, Page page)
    {
        mapz.put("data",ls);
        mapz.put("currentPage",page.getNumber());
        mapz.put("totalItems",page.getTotalElements());
        mapz.put("totalPages",page.getTotalPages());
        mapz.put("sort",page.getSort());
        mapz.put("numberOfElements",page.getNumberOfElements());

        return mapz;
    }
}