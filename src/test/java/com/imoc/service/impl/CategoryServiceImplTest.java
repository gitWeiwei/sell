package com.imoc.service.impl;

import com.imoc.entity.ProductCategory;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired(required = false)
    private CategoryServiceImpl categoryServiceImpl;


    @Test
    public void findById() {
        ProductCategory productCategory = categoryServiceImpl.findById(1);
        System.out.println(productCategory.getCategoryName());
      //  System.out.println(1);
       // Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = categoryServiceImpl.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> type = Arrays.asList(1);
        List<ProductCategory> list = categoryServiceImpl.findByCategoryTypeIn(type);
        System.out.println(list.size()+">>>>>>>>>>>>>>");
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("产品7",7);
        categoryServiceImpl.save(productCategory);
    }
}