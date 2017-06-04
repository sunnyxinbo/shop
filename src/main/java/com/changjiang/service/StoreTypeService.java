package com.changjiang.service;

import com.changjiang.entity.StoreType;

import java.util.List;
public interface StoreTypeService{
    long getStoreTypeRowCount();
    List<StoreType> selectStoreType();
    StoreType selectStoreTypeById(Integer id);
    int insertStoreType(StoreType value);
    int insertNonEmptyStoreType(StoreType value);
    int deleteStoreTypeById(Integer id);
    int updateStoreTypeById(StoreType enti);
    int updateNonEmptyStoreTypeById(StoreType enti);

    /**
     * 通过店面类型查询所有的店面  嵌套结果: 使用嵌套结果映射来处理重复的联合结果的子集
     * @param id
     * @return
     */
    List<StoreType> getStoresByStoreType(Integer id);
}