package com.changjiang.mapper;

import com.changjiang.entity.WorkstationRecord;

public interface WorkstationRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkstationRecord record);

    int insertSelective(WorkstationRecord record);

    WorkstationRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkstationRecord record);

    int updateByPrimaryKey(WorkstationRecord record);
}