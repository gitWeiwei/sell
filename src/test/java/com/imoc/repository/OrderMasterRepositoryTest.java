package com.imoc.repository;

import com.imoc.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private  OrderMasterRepository orderMasterRepository;

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("北京市朝阳区");
        orderMaster.setBuyerName("张悦");
        orderMaster.setBuyerPhone("15209875362");
        orderMaster.setBuyerOpenid("111");
        orderMaster.setOrderAmount(new BigDecimal(180));
        orderMaster.setOrderId("123457");
        OrderMaster orderMaster1 = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(orderMaster1);
    }

    @Test
    public void findByBuyerOpenid(){
        PageRequest pageRequest = PageRequest.of(0,10);
        Page<OrderMaster>  orderMasterPage = orderMasterRepository.findByBuyerOpenid("123456",pageRequest);
        Assert.assertNotEquals(0,orderMasterPage.getTotalElements());
    }


}