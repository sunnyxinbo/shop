package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.CounterType;
public interface CounterTypeService{
    long getCounterTypeRowCount();
    List<CounterType> selectCounterType();
    CounterType selectCounterTypeById(Integer id);
    int insertCounterType(CounterType value);
    int insertNonEmptyCounterType(CounterType value);
    int deleteCounterTypeById(Integer id);
    int updateCounterTypeById(CounterType enti);
    int updateNonEmptyCounterTypeById(CounterType enti);
}