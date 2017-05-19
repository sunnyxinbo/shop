package com.changjiang.mapper;

import com.changjiang.entity.WorkStation;

public interface WorkStationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkStation record);

    int insertSelective(WorkStation record);

    WorkStation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkStation record);

    int updateByPrimaryKey(WorkStation record);
}