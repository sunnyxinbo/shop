package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.StoreType;
import com.changjiang.common.Assist;
public interface StoreTypeService{
    long getStoreTypeRowCount(Assist assist);
    List<StoreType> selectStoreType(Assist assist);
    StoreType selectStoreTypeById(Integer id);
    int insertStoreType(StoreType value);
    int insertNonEmptyStoreType(StoreType value);
    int deleteStoreTypeById(Integer id);
    int deleteStoreType(Assist assist);
    int updateStoreTypeById(StoreType enti);
    int updateStoreType(StoreType value, Assist assist);
    int updateNonEmptyStoreTypeById(StoreType enti);
    int updateNonEmptyStoreType(StoreType value, Assist assist);
}