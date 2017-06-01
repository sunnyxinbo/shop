package com.changjiang.service;
import java.util.List;
import com.changjiang.dao.ProducteTypeDao;
import com.changjiang.entity.ProducteType;
import com.changjiang.common.Assist;
public class ProducteTypeServiceImpl implements ProducteTypeService{
    private ProducteTypeDao producteTypeDao;
    @Override
    public long getProducteTypeRowCount(Assist assist){
        return producteTypeDao.getProducteTypeRowCount(assist);
    }
    @Override
    public List<ProducteType> selectProducteType(Assist assist){
        return producteTypeDao.selectProducteType(assist);
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
    public int deleteProducteType(Assist assist){
        return producteTypeDao.deleteProducteType(assist);
    }
    @Override
    public int updateProducteTypeById(ProducteType enti){
        return producteTypeDao.updateProducteTypeById(enti);
    }
    @Override
    public int updateProducteType(ProducteType value, Assist assist){
        return producteTypeDao.updateProducteType(value,assist);
    }
    @Override
    public int updateNonEmptyProducteTypeById(ProducteType enti){
        return producteTypeDao.updateNonEmptyProducteTypeById(enti);
    }
    @Override
    public int updateNonEmptyProducteType(ProducteType value, Assist assist){
        return producteTypeDao.updateNonEmptyProducteType(value,assist);
    }

    public ProducteTypeDao getProducteTypeDao() {
        return this.producteTypeDao;
    }

    public void setProducteTypeDao(ProducteTypeDao producteTypeDao) {
        this.producteTypeDao = producteTypeDao;
    }

}