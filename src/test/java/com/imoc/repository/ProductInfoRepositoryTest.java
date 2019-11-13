package com.imoc.repository;
import com.imoc.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired(required = true)
    private ProductInfoRepository repository;

    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("红枣燕麦粥");
        productInfo.setProdcutStock(100);
        productInfo.setCategoryType(1);
        productInfo.setProductDescription("美颜粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("http://xxx.jpg");
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void  findByProductStatus(){
        List<ProductInfo> infoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,infoList.size());
    }

}