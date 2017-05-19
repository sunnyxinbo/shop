package com.changjiang.mapper;

import com.changjiang.entity.AreaType;

public interface AreaTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AreaType record);

    int insertSelective(AreaType record);

    AreaType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AreaType record);

    int updateByPrimaryKey(AreaType record);
}