package com.changjiang.dao;
import com.changjiang.entity.CounterType;
import java.util.List;
public interface CounterTypeDao{
    long getCounterTypeRowCount();
    List<CounterType> selectCounterType();
    CounterType selectCounterTypeById(Integer id);
    int insertCounterType(CounterType value);
    int insertNonEmptyCounterType(CounterType value);
    int deleteCounterTypeById(Integer id);
    int updateCounterTypeById(CounterType enti);
    int updateNonEmptyCounterTypeById(CounterType enti);
}