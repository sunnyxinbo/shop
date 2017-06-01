package com.changjiang.dao;
import com.changjiang.entity.ProducteType;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface ProducteTypeDao{
    long getProducteTypeRowCount(Assist assist);
    List<ProducteType> selectProducteType(Assist assist);
    ProducteType selectProducteTypeById(Integer id);
    int insertProducteType(ProducteType value);
    int insertNonEmptyProducteType(ProducteType value);
    int deleteProducteTypeById(Integer id);
    int deleteProducteType(Assist assist);
    int updateProducteTypeById(ProducteType enti);
    int updateProducteType(@Param("enti") ProducteType value, @Param("assist") Assist assist);
    int updateNonEmptyProducteTypeById(ProducteType enti);
    int updateNonEmptyProducteType(@Param("enti") ProducteType value, @Param("assist") Assist assist);
}