package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.CounterWorkStationRecord;
public interface CounterWorkStationRecordService{
    long getCounterWorkStationRecordRowCount();
    List<CounterWorkStationRecord> selectCounterWorkStationRecord();
    CounterWorkStationRecord selectCounterWorkStationRecordById(Integer id);
    int insertCounterWorkStationRecord(CounterWorkStationRecord value);
    int insertNonEmptyCounterWorkStationRecord(CounterWorkStationRecord value);
    int deleteCounterWorkStationRecordById(Integer id);
    int updateCounterWorkStationRecordById(CounterWorkStationRecord enti);
    int updateNonEmptyCounterWorkStationRecordById(CounterWorkStationRecord enti);
}