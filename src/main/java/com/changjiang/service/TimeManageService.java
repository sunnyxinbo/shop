package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.TimeManage;
public interface TimeManageService{
    long getTimeManageRowCount();
    List<TimeManage> selectTimeManage();
    TimeManage selectTimeManageById(Integer id);
    int insertTimeManage(TimeManage value);
    int insertNonEmptyTimeManage(TimeManage value);
    int deleteTimeManageById(Integer id);
    int updateTimeManageById(TimeManage enti);
    int updateNonEmptyTimeManageById(TimeManage enti);
}