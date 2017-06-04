package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Store;
public interface StoreService{
    long getStoreRowCount();
    List<Store> selectStore();
    Store selectStoreById(Integer id);
    int insertStore(Store value);
    int insertNonEmptyStore(Store value);
    int deleteStoreById(Integer id);
    int updateStoreById(Store enti);
    int updateNonEmptyStoreById(Store enti);
}