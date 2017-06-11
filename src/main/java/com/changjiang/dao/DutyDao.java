package com.changjiang.dao;
import com.changjiang.entity.Duty;
import java.util.List;
public interface DutyDao{
    long getDutyRowCount();
    List<Duty> selectDuty();
    Duty selectDutyById(Integer id);
    int insertDuty(Duty value);
    int insertNonEmptyDuty(Duty value);
    int deleteDutyById(Integer id);
    int updateDutyById(Duty enti);
    int updateNonEmptyDutyById(Duty enti);
}