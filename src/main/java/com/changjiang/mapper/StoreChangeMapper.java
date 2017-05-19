package com.changjiang.mapper;

import com.changjiang.entity.StoreChange;

public interface StoreChangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreChange record);

    int insertSelective(StoreChange record);

    StoreChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreChange record);

    int updateByPrimaryKey(StoreChange record);
}