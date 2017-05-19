package com.changjiang.mapper;

import com.changjiang.entity.CounterType;

public interface CounterTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CounterType record);

    int insertSelective(CounterType record);

    CounterType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CounterType record);

    int updateByPrimaryKey(CounterType record);
}