package com.imoc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity@Table(name = "product_info")
@Data
public class ProductInfo {
    @Id
    private String productId;

    private  String productName;

    private BigDecimal productPrice;

    private Integer prodcutStock;

    private  String productDescription;

    private String productIcon;
/*状态 0：正常 1：下架*/
    private Integer productStatus;

    private Integer categoryType;
}
