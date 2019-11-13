package com.imoc.repository;
import com.imoc.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {
    @Autowired(required = false)
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void test02(){
        ProductCategory productCategory = productCategoryRepository.findById(1).get();
        System.out.println(productCategory.getCategoryName()+">>>>>>>>"+productCategory.getCategoryType());
        System.out.println("总数：："+productCategoryRepository.count());
    }

}
