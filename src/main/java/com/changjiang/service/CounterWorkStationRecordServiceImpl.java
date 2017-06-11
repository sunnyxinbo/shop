package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.CounterWorkStationRecordDao;
import com.changjiang.entity.CounterWorkStationRecord;
@Service
public class CounterWorkStationRecordServiceImpl implements CounterWorkStationRecordService{
    @Autowired
	private CounterWorkStationRecordDao counterWorkStationRecordDao;
    @Override
    public long getCounterWorkStationRecordRowCount(){
        return counterWorkStationRecordDao.getCounterWorkStationRecordRowCount();
    }
    @Override
    public List<CounterWorkStationRecord> selectCounterWorkStationRecord(){
        return counterWorkStationRecordDao.selectCounterWorkStationRecord();
    }
    @Override
    public CounterWorkStationRecord selectCounterWorkStationRecordById(Integer id){
        return counterWorkStationRecordDao.selectCounterWorkStationRecordById(id);
    }
    @Override
    public int insertCounterWorkStationRecord(CounterWorkStationRecord value){
        return counterWorkStationRecordDao.insertCounterWorkStationRecord(value);
    }
    @Override
    public int insertNonEmptyCounterWorkStationRecord(CounterWorkStationRecord value){
        return counterWorkStationRecordDao.insertNonEmptyCounterWorkStationRecord(value);
    }
    @Override
    public int deleteCounterWorkStationRecordById(Integer id){
        return counterWorkStationRecordDao.deleteCounterWorkStationRecordById(id);
    }
    @Override
    public int updateCounterWorkStationRecordById(CounterWorkStationRecord enti){
        return counterWorkStationRecordDao.updateCounterWorkStationRecordById(enti);
    }
    @Override
    public int updateNonEmptyCounterWorkStationRecordById(CounterWorkStationRecord enti){
        return counterWorkStationRecordDao.updateNonEmptyCounterWorkStationRecordById(enti);
    }

    public CounterWorkStationRecordDao getCounterWorkStationRecordDao() {
        return this.counterWorkStationRecordDao;
    }

    public void setCounterWorkStationRecordDao(CounterWorkStationRecordDao counterWorkStationRecordDao) {
        this.counterWorkStationRecordDao = counterWorkStationRecordDao;
    }

}