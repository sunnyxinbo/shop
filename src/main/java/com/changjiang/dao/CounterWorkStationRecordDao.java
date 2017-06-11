package com.changjiang.dao;
import com.changjiang.entity.CounterWorkStationRecord;
import java.util.List;
public interface CounterWorkStationRecordDao{
    long getCounterWorkStationRecordRowCount();
    List<CounterWorkStationRecord> selectCounterWorkStationRecord();
    CounterWorkStationRecord selectCounterWorkStationRecordById(Integer id);
    int insertCounterWorkStationRecord(CounterWorkStationRecord value);
    int insertNonEmptyCounterWorkStationRecord(CounterWorkStationRecord value);
    int deleteCounterWorkStationRecordById(Integer id);
    int updateCounterWorkStationRecordById(CounterWorkStationRecord enti);
    int updateNonEmptyCounterWorkStationRecordById(CounterWorkStationRecord enti);
}