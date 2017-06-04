package com.changjiang.service;
import com.changjiang.entity.StoreProducte;
import com.changjiang.dao.StoreProducteDao;
import com.changjiang.service.StoreProducteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店面产品业务层
 */
@Service
public class StoreProducteServiceImpl implements StoreProducteService{
    @Autowired
    private StoreProducteDao storeProducteDao;
    @Override
    public long getStoreProducteRowCount(){
        return storeProducteDao.getStoreProducteRowCount();
    }

    /**
     * 查询所有的店面产品
     * @return
     */
    @Override
    public List<StoreProducte> selectStoreProducte(){
        return storeProducteDao.selectStoreProducte();
    }
    @Override
    public StoreProducte selectStoreProducteById(Integer id){
        return storeProducteDao.selectStoreProducteById(id);
    }
    @Override
    public int insertStoreProducte(StoreProducte value){
        return storeProducteDao.insertStoreProducte(value);
    }
    @Override
    public int insertNonEmptyStoreProducte(StoreProducte value){
        return storeProducteDao.insertNonEmptyStoreProducte(value);
    }
    @Override
    public int deleteStoreProducteById(Integer id){
        return storeProducteDao.deleteStoreProducteById(id);
    }
    @Override
    public int updateStoreProducteById(StoreProducte enti){
        return storeProducteDao.updateStoreProducteById(enti);
    }
    @Override
    public int updateNonEmptyStoreProducteById(StoreProducte enti){
        return storeProducteDao.updateNonEmptyStoreProducteById(enti);
    }

    public StoreProducteDao getStoreProducteDao() {
        return this.storeProducteDao;
    }

    public void setStoreProducteDao(StoreProducteDao storeProducteDao) {
        this.storeProducteDao = storeProducteDao;
    }

}