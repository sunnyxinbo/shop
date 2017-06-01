package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.ProducteType;
import com.changjiang.common.Assist;
public interface ProducteTypeService{
    long getProducteTypeRowCount(Assist assist);
    List<ProducteType> selectProducteType(Assist assist);
    ProducteType selectProducteTypeById(Integer id);
    int insertProducteType(ProducteType value);
    int insertNonEmptyProducteType(ProducteType value);
    int deleteProducteTypeById(Integer id);
    int deleteProducteType(Assist assist);
    int updateProducteTypeById(ProducteType enti);
    int updateProducteType(ProducteType value, Assist assist);
    int updateNonEmptyProducteTypeById(ProducteType enti);
    int updateNonEmptyProducteType(ProducteType value, Assist assist);
}