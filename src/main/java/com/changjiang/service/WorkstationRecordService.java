package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.WorkstationRecord;
public interface WorkstationRecordService{
    long getWorkstationRecordRowCount();
    List<WorkstationRecord> selectWorkstationRecord();
    WorkstationRecord selectWorkstationRecordById(Integer id);
    int insertWorkstationRecord(WorkstationRecord value);
    int insertNonEmptyWorkstationRecord(WorkstationRecord value);
    int deleteWorkstationRecordById(Integer id);
    int updateWorkstationRecordById(WorkstationRecord enti);
    int updateNonEmptyWorkstationRecordById(WorkstationRecord enti);
}