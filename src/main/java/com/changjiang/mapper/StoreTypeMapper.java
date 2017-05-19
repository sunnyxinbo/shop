package com.changjiang.mapper;

import com.changjiang.entity.StoreType;

public interface StoreTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreType record);

    int insertSelective(StoreType record);

    StoreType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreType record);

    int updateByPrimaryKey(StoreType record);
}