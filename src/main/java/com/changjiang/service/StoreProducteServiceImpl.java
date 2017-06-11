package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.StoreProducteDao;
import com.changjiang.entity.StoreProducte;
@Service
public class StoreProducteServiceImpl implements StoreProducteService{
	@Autowired
    private StoreProducteDao storeProducteDao;
    @Override
    public long getStoreProducteRowCount(){
        return storeProducteDao.getStoreProducteRowCount();
    }
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