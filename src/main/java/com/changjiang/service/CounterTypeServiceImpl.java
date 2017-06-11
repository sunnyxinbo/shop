package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.CounterTypeDao;
import com.changjiang.entity.CounterType;
@Service
public class CounterTypeServiceImpl implements CounterTypeService{
	@Autowired
    private CounterTypeDao counterTypeDao;
    @Override
    public long getCounterTypeRowCount(){
        return counterTypeDao.getCounterTypeRowCount();
    }
    @Override
    public List<CounterType> selectCounterType(){
        return counterTypeDao.selectCounterType();
    }
    @Override
    public CounterType selectCounterTypeById(Integer id){
        return counterTypeDao.selectCounterTypeById(id);
    }
    @Override
    public int insertCounterType(CounterType value){
        return counterTypeDao.insertCounterType(value);
    }
    @Override
    public int insertNonEmptyCounterType(CounterType value){
        return counterTypeDao.insertNonEmptyCounterType(value);
    }
    @Override
    public int deleteCounterTypeById(Integer id){
        return counterTypeDao.deleteCounterTypeById(id);
    }
    @Override
    public int updateCounterTypeById(CounterType enti){
        return counterTypeDao.updateCounterTypeById(enti);
    }
    @Override
    public int updateNonEmptyCounterTypeById(CounterType enti){
        return counterTypeDao.updateNonEmptyCounterTypeById(enti);
    }

    public CounterTypeDao getCounterTypeDao() {
        return this.counterTypeDao;
    }

    public void setCounterTypeDao(CounterTypeDao counterTypeDao) {
        this.counterTypeDao = counterTypeDao;
    }

}