package com.changjiang.dao;
import com.changjiang.entity.WorkStation;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface WorkStationDao{
    long getWorkStationRowCount(Assist assist);
    List<WorkStation> selectWorkStation(Assist assist);
    WorkStation selectWorkStationById(Integer id);
    int insertWorkStation(WorkStation value);
    int insertNonEmptyWorkStation(WorkStation value);
    int deleteWorkStationById(Integer id);
    int deleteWorkStation(Assist assist);
    int updateWorkStationById(WorkStation enti);
    int updateWorkStation(@Param("enti") WorkStation value, @Param("assist") Assist assist);
    int updateNonEmptyWorkStationById(WorkStation enti);
    int updateNonEmptyWorkStation(@Param("enti") WorkStation value, @Param("assist") Assist assist);
}