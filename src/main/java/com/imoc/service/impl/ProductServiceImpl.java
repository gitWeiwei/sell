package com.imoc.service.impl;

import com.imoc.entity.ProductInfo;
import com.imoc.enums.ProductStatusEnum;
import com.imoc.repository.ProductInfoRepository;
import com.imoc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
     private ProductInfoRepository infoRepository;

    @Override
    public ProductInfo findById(String productId) {
        return infoRepository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return infoRepository.findByProductStatus(ProductStatusEnum.Up.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return infoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return infoRepository.save(productInfo);
    }
}
