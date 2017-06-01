package com.changjiang.service;
import java.util.List;
import com.changjiang.dao.CounterDao;
import com.changjiang.entity.Counter;
import com.changjiang.common.Assist;
public class CounterServiceImpl implements CounterService{
    private CounterDao counterDao;
    @Override
    public long getCounterRowCount(Assist assist){
        return counterDao.getCounterRowCount(assist);
    }
    @Override
    public List<Counter> selectCounter(Assist assist){
        return counterDao.selectCounter(assist);
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
    public int deleteCounter(Assist assist){
        return counterDao.deleteCounter(assist);
    }
    @Override
    public int updateCounterById(Counter enti){
        return counterDao.updateCounterById(enti);
    }
    @Override
    public int updateCounter(Counter value, Assist assist){
        return counterDao.updateCounter(value,assist);
    }
    @Override
    public int updateNonEmptyCounterById(Counter enti){
        return counterDao.updateNonEmptyCounterById(enti);
    }
    @Override
    public int updateNonEmptyCounter(Counter value, Assist assist){
        return counterDao.updateNonEmptyCounter(value,assist);
    }

    public CounterDao getCounterDao() {
        return this.counterDao;
    }

    public void setCounterDao(CounterDao counterDao) {
        this.counterDao = counterDao;
    }

}