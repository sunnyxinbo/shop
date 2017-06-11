package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.WorkStation;
public interface WorkStationService{
    long getWorkStationRowCount();
    List<WorkStation> selectWorkStation();
    WorkStation selectWorkStationById(Integer id);
    int insertWorkStation(WorkStation value);
    int insertNonEmptyWorkStation(WorkStation value);
    int deleteWorkStationById(Integer id);
    int updateWorkStationById(WorkStation enti);
    int updateNonEmptyWorkStationById(WorkStation enti);
}