package com.changjiang.mapper;

import com.changjiang.entity.Counter;

public interface CounterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Counter record);

    int insertSelective(Counter record);

    Counter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}