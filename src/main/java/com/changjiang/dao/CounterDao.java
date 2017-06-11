package com.changjiang.dao;
import com.changjiang.entity.Counter;
import java.util.List;
public interface CounterDao{
    long getCounterRowCount();
    List<Counter> selectCounter();
    Counter selectCounterById(Integer id);
    int insertCounter(Counter value);
    int insertNonEmptyCounter(Counter value);
    int deleteCounterById(Integer id);
    int updateCounterById(Counter enti);
    int updateNonEmptyCounterById(Counter enti);
}