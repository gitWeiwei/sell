package com.imoc.dto;

import com.imoc.entity.OrderDetail;
import com.imoc.entity.OrderMaster;
import lombok.Data;

import java.util.List;
@Data
public class OrderDTO extends OrderMaster {
    private List<OrderDetail> orderDetailList;
}
