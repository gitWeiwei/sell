package com.imoc.controller;

import com.imoc.entity.ProductCategory;
import com.imoc.entity.ProductInfo;
import com.imoc.repository.ProductInfoRepository;
import com.imoc.service.CategoryService;
import com.imoc.service.ProductService;
import com.imoc.util.BeanUtil;
import com.imoc.util.ResultVoUtil;
import com.imoc.vo.ProductInfoVo;
import com.imoc.vo.ProductVo;
import com.imoc.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buy/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVo list(){
        //查询所有上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //查询类目（一次性查询）
       // List<Integer> categoryTypeList = new ArrayList<Integer>();
        List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        List<ProductVo> productVoList = new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
                ProductVo productVo = new ProductVo();
                productVo.setCategoryName(productCategory.getCategoryName());
                productVo.setCategoryType(productCategory.getCategoryType());
                List<ProductInfoVo> productInfoVoList = new ArrayList<>();
                for (ProductInfo productInfo:productInfoList){
                    if(productInfo.getCategoryType()==productCategory.getCategoryType()){
                        ProductInfoVo productInfoVo = new ProductInfoVo();
                        BeanUtils.copyProperties(productInfo,productInfoVo);
                        productInfoVoList.add(productInfoVo);
                    }
                }
            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }
        //数据拼装
        return ResultVoUtil.sucess(productVoList);
    }
}
