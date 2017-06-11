package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Counter;
public interface CounterService{
    long getCounterRowCount();
    List<Counter> selectCounter();
    Counter selectCounterById(Integer id);
    int insertCounter(Counter value);
    int insertNonEmptyCounter(Counter value);
    int deleteCounterById(Integer id);
    int updateCounterById(Counter enti);
    int updateNonEmptyCounterById(Counter enti);
}