package com.changjiang.dao;
import com.changjiang.entity.StoreProducte;
import java.util.List;
public interface StoreProducteDao{
    long getStoreProducteRowCount();
    List<StoreProducte> selectStoreProducte();
    StoreProducte selectStoreProducteById(Integer id);
    int insertStoreProducte(StoreProducte value);
    int insertNonEmptyStoreProducte(StoreProducte value);
    int deleteStoreProducteById(Integer id);
    int updateStoreProducteById(StoreProducte enti);
    int updateNonEmptyStoreProducteById(StoreProducte enti);
}