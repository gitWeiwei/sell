package com.imoc.sell;

import com.imoc.entity.ProductCategory;
import com.imoc.repository.ProductCategoryRepository;
import com.sun.glass.ui.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired(required = false)
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.getOne(1);
        System.out.println(productCategory.getCategoryName()+">>>>>>>>>"+productCategory.getCategoryType());
    }
    @Test
    public void test02(){
        ProductCategory productCategory = productCategoryRepository.findById(1).get();
        System.out.println(productCategory.getCategoryName()+">>>>>>>>"+productCategory.getCategoryType());
        System.out.println("总数：："+productCategoryRepository.count());
    }

}