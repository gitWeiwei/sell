package com.imoc.repository;


import com.imoc.entity.OrderDetail;
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
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123457");
        orderDetail.setOrderId("123457");
        orderDetail.setProductIcon("http://yyy.jpg");
        orderDetail.setProductId("123456");
        orderDetail.setProductName("小龙虾");
        orderDetail.setProductPrice(new BigDecimal(56));
        orderDetail.setProductQuantity(1);
        orderDetailRepository.save(orderDetail);

    }
    @Test
    public void findByOrOrderId(){
        List<OrderDetail> detailList =orderDetailRepository.findByOrOrderId("123457");
        Assert.assertNotEquals(0,detailList.size());
    }


}