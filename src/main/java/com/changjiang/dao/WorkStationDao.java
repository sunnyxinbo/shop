package com.changjiang.dao;
import com.changjiang.entity.WorkStation;
import java.util.List;
public interface WorkStationDao{
    long getWorkStationRowCount();
    List<WorkStation> selectWorkStation();
    WorkStation selectWorkStationById(Integer id);
    int insertWorkStation(WorkStation value);
    int insertNonEmptyWorkStation(WorkStation value);
    int deleteWorkStationById(Integer id);
    int updateWorkStationById(WorkStation enti);
    int updateNonEmptyWorkStationById(WorkStation enti);
}