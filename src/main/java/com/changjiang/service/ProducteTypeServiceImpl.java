package com.changjiang.service;
import com.changjiang.entity.ProducteType;
import com.changjiang.dao.ProducteTypeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 产品类型业务层
 */
@Service
public class ProducteTypeServiceImpl implements ProducteTypeService{
    @Autowired
    private ProducteTypeDao producteTypeDao;
    @Override
    public long getProducteTypeRowCount(){
        return producteTypeDao.getProducteTypeRowCount();
    }

    /**
     * 查询所有的产品类型
     * @return
     */
    @Override
    public List<ProducteType> selectProducteType(){
        return producteTypeDao.selectProducteType();
    }
    @Override
    public ProducteType selectProducteTypeById(Integer id){
        return producteTypeDao.selectProducteTypeById(id);
    }
    @Override
    public int insertProducteType(ProducteType value){
        return producteTypeDao.insertProducteType(value);
    }
    @Override
    public int insertNonEmptyProducteType(ProducteType value){
        return producteTypeDao.insertNonEmptyProducteType(value);
    }
    @Override
    public int deleteProducteTypeById(Integer id){
        return producteTypeDao.deleteProducteTypeById(id);
    }
    @Override
    public int updateProducteTypeById(ProducteType enti){
        return producteTypeDao.updateProducteTypeById(enti);
    }
    @Override
    public int updateNonEmptyProducteTypeById(ProducteType enti){
        return producteTypeDao.updateNonEmptyProducteTypeById(enti);
    }
    /**
     * 通过产品类型查询所有的店面产品以及办公贸易
     * @param id
     * @return
     */
    @Override
    public List<ProducteType> selectOfficialTradeAndProductByTypeId(Integer id) {
        return producteTypeDao.selectOfficialTradeAndProductByTypeId(id);
    }
    /**
     * 通过产品类型查询所有的店面产品
     * @param id
     * @return
     */
    @Override
    public List<ProducteType> selectStoreProductByTypeId(Integer id) {
        return producteTypeDao.selectStoreProductByTypeId(id);
    }

    public ProducteTypeDao getProducteTypeDao() {
        return this.producteTypeDao;
    }

    public void setProducteTypeDao(ProducteTypeDao producteTypeDao) {
        this.producteTypeDao = producteTypeDao;
    }

}