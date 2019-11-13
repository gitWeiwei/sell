package com.imoc.service.impl;

import com.imoc.dto.OrderDTO;
import com.imoc.entity.OrderDetail;
import com.imoc.entity.ProductInfo;
import com.imoc.repository.OrderMasterRepository;
import com.imoc.service.OrderService;
import com.imoc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private ProductService productService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //1.查询商品（数量，价格）
        for(OrderDetail orderDetail:orderDTO.getOrderDetailList()){
           ProductInfo productInfo = productService.findById(orderDetail.getProductId());
        }
        //计算总价

        //3.写入订单数据库

        //4.下单成功，扣库存
        return null;
    }

    @Override
    public OrderDTO findById(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
