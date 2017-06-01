package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Counter;
import com.changjiang.common.Assist;
public interface CounterService{
    long getCounterRowCount(Assist assist);
    List<Counter> selectCounter(Assist assist);
    Counter selectCounterById(Integer id);
    int insertCounter(Counter value);
    int insertNonEmptyCounter(Counter value);
    int deleteCounterById(Integer id);
    int deleteCounter(Assist assist);
    int updateCounterById(Counter enti);
    int updateCounter(Counter value, Assist assist);
    int updateNonEmptyCounterById(Counter enti);
    int updateNonEmptyCounter(Counter value, Assist assist);
}