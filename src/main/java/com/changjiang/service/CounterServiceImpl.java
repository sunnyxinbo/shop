package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.CounterDao;
import com.changjiang.entity.Counter;
@Service
public class CounterServiceImpl implements CounterService{
	@Autowired
    private CounterDao counterDao;
    @Override
    public long getCounterRowCount(){
        return counterDao.getCounterRowCount();
    }
    @Override
    public List<Counter> selectCounter(){
        return counterDao.selectCounter();
    }
    @Override
    public Counter selectCounterById(Integer id){
        return counterDao.selectCounterById(id);
    }
    @Override
    public int insertCounter(Counter value){
        return counterDao.insertCounter(value);
    }
    @Override
    public int insertNonEmptyCounter(Counter value){
        return counterDao.insertNonEmptyCounter(value);
    }
    @Override
    public int deleteCounterById(Integer id){
        return counterDao.deleteCounterById(id);
    }
    @Override
    public int updateCounterById(Counter enti){
        return counterDao.updateCounterById(enti);
    }
    @Override
    public int updateNonEmptyCounterById(Counter enti){
        return counterDao.updateNonEmptyCounterById(enti);
    }

    public CounterDao getCounterDao() {
        return this.counterDao;
    }

    public void setCounterDao(CounterDao counterDao) {
        this.counterDao = counterDao;
    }

}