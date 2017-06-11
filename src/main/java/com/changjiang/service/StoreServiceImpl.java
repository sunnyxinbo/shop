package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.StoreDao;
import com.changjiang.entity.Store;
@Service
public class StoreServiceImpl implements StoreService{
	@Autowired
    private StoreDao storeDao;
    @Override
    public long getStoreRowCount(){
        return storeDao.getStoreRowCount();
    }
    @Override
    public List<Store> selectStore(){
        return storeDao.selectStore();
    }
    @Override
    public Store selectStoreById(Integer id){
        return storeDao.selectStoreById(id);
    }
    @Override
    public int insertStore(Store value){
        return storeDao.insertStore(value);
    }
    @Override
    public int insertNonEmptyStore(Store value){
        return storeDao.insertNonEmptyStore(value);
    }
    @Override
    public int deleteStoreById(Integer id){
        return storeDao.deleteStoreById(id);
    }
    @Override
    public int updateStoreById(Store enti){
        return storeDao.updateStoreById(enti);
    }
    @Override
    public int updateNonEmptyStoreById(Store enti){
        return storeDao.updateNonEmptyStoreById(enti);
    }

    public StoreDao getStoreDao() {
        return this.storeDao;
    }

    public void setStoreDao(StoreDao storeDao) {
        this.storeDao = storeDao;
    }

}