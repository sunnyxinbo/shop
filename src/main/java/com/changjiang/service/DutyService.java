package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Duty;
import com.changjiang.common.Assist;
public interface DutyService{
    long getDutyRowCount(Assist assist);
    List<Duty> selectDutyByStoreNumber(String storeNumber);
    Duty selectDutyById(Integer id);
    int insertDuty(Duty value);
    int insertNonEmptyDuty(Duty value);
    int deleteDutyById(Integer id);
    int deleteDuty(Assist assist);
    int updateDutyById(Duty enti);
    int updateDuty(Duty value, Assist assist);
    int updateNonEmptyDutyById(Duty enti);
    int updateNonEmptyDuty(Duty value, Assist assist);
}