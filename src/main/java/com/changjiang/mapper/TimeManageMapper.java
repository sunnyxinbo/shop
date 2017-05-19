package com.changjiang.mapper;

import com.changjiang.entity.TimeManage;

public interface TimeManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TimeManage record);

    int insertSelective(TimeManage record);

    TimeManage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TimeManage record);

    int updateByPrimaryKeyWithBLOBs(TimeManage record);

    int updateByPrimaryKey(TimeManage record);
}