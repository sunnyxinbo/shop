package com.changjiang.dao;
import com.changjiang.entity.WorkstationRecord;
import java.util.List;
public interface WorkstationRecordDao{
    long getWorkstationRecordRowCount();
    List<WorkstationRecord> selectWorkstationRecord();
    WorkstationRecord selectWorkstationRecordById(Integer id);
    int insertWorkstationRecord(WorkstationRecord value);
    int insertNonEmptyWorkstationRecord(WorkstationRecord value);
    int deleteWorkstationRecordById(Integer id);
    int updateWorkstationRecordById(WorkstationRecord enti);
    int updateNonEmptyWorkstationRecordById(WorkstationRecord enti);
}