package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.ProducteType;
public interface ProducteTypeService{
    long getProducteTypeRowCount();
    List<ProducteType> selectProducteType();
    ProducteType selectProducteTypeById(Integer id);
    int insertProducteType(ProducteType value);
    int insertNonEmptyProducteType(ProducteType value);
    int deleteProducteTypeById(Integer id);
    int updateProducteTypeById(ProducteType enti);
    int updateNonEmptyProducteTypeById(ProducteType enti);
    /**
     * 通过产品类型查询所有的店面产品以及办公贸易
     * @param id
     * @return
     */
    List<ProducteType> selectOfficialTradeAndProductByTypeId(Integer id);
    /**
     * 通过产品类型查询所有的店面产品
     * @param id
     * @return
     */
    List<ProducteType> selectStoreProductByTypeId(Integer id);
}