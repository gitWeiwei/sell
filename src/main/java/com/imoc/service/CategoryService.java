package com.imoc.service;

import com.imoc.entity.ProductCategory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CategoryService {

   ProductCategory findById(Integer id);

   List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);



}
