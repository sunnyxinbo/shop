package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Duty;
public interface DutyService{
    long getDutyRowCount();
    List<Duty> selectDuty();
    Duty selectDutyById(Integer id);
    int insertDuty(Duty value);
    int insertNonEmptyDuty(Duty value);
    int deleteDutyById(Integer id);
    int updateDutyById(Duty enti);
    int updateNonEmptyDutyById(Duty enti);
}