package com.changjiang.dao;
import com.changjiang.entity.TimeManage;
import java.util.List;
public interface TimeManageDao{
    long getTimeManageRowCount();
    List<TimeManage> selectTimeManage();
    TimeManage selectTimeManageById(Integer id);
    int insertTimeManage(TimeManage value);
    int insertNonEmptyTimeManage(TimeManage value);
    int deleteTimeManageById(Integer id);
    int updateTimeManageById(TimeManage enti);
    int updateNonEmptyTimeManageById(TimeManage enti);
}