package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.WorkStation;
import com.changjiang.common.Assist;
public interface WorkStationService{
    long getWorkStationRowCount(Assist assist);
    List<WorkStation> selectWorkStation(Assist assist);
    WorkStation selectWorkStationById(Integer id);
    int insertWorkStation(WorkStation value);
    int insertNonEmptyWorkStation(WorkStation value);
    int deleteWorkStationById(Integer id);
    int deleteWorkStation(Assist assist);
    int updateWorkStationById(WorkStation enti);
    int updateWorkStation(WorkStation value, Assist assist);
    int updateNonEmptyWorkStationById(WorkStation enti);
    int updateNonEmptyWorkStation(WorkStation value, Assist assist);
}