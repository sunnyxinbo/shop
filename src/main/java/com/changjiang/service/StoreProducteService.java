package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.StoreProducte;
public interface StoreProducteService{
    long getStoreProducteRowCount();
    List<StoreProducte> selectStoreProducte();
    StoreProducte selectStoreProducteById(Integer id);
    int insertStoreProducte(StoreProducte value);
    int insertNonEmptyStoreProducte(StoreProducte value);
    int deleteStoreProducteById(Integer id);
    int updateStoreProducteById(StoreProducte enti);
    int updateNonEmptyStoreProducteById(StoreProducte enti);
}