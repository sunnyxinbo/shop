package com.changjiang.dao;
import com.changjiang.entity.Store;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository("StoreDao")
public interface StoreDao{
    long getStoreRowCount();
    List<Store> selectStore();
    Store selectStoreById(Integer id);
    int insertStore(Store value);
    int insertNonEmptyStore(Store value);
    int deleteStoreById(Integer id);
    int updateStoreById(Store enti);
    int updateNonEmptyStoreById(Store enti);
}