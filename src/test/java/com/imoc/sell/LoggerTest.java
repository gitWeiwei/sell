package com.imoc.sell;


import com.imoc.entity.ProductCategory;
import com.imoc.repository.ProductCategoryRepository;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Autowired(required = false)
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void test02(){
        ProductCategory productCategory = productCategoryRepository.findById(1).get();
        System.out.println(productCategory.getCategoryName()+">>>>>>>>"+productCategory.getCategoryType());
        System.out.println("总数：："+productCategoryRepository.count());
    }
    @Test
    @Transactional
    public void testSave(){
        ProductCategory productCategory = new ProductCategory("产品4",3);
        ProductCategory productCategory1 = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(productCategory1);
    }

    @Test
    public void testUpdate(){
        ProductCategory productCategory =  productCategoryRepository.findById(3).get();
       // productCategory.setCategoryName("产品2");
        productCategory.setCategoryType(4);
       // productCategory.setCategoryId(2);
        productCategoryRepository.save(productCategory);
    }
    @Test
    public  void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(1,3,4,5);
        List<ProductCategory> productCategoryList = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void test01(){
        String name="imooc";
        String password ="123456";
        log.info("name:{},password:{}",name,password);
        log.debug("debug....");
        log.info("info...");
        log.error("error....");
    }


}
