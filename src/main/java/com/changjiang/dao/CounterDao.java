package com.changjiang.dao;
import com.changjiang.entity.Counter;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface CounterDao{
    long getCounterRowCount(Assist assist);
    List<Counter> selectCounter(Assist assist);
    Counter selectCounterById(Integer id);
    int insertCounter(Counter value);
    int insertNonEmptyCounter(Counter value);
    int deleteCounterById(Integer id);
    int deleteCounter(Assist assist);
    int updateCounterById(Counter enti);
    int updateCounter(@Param("enti") Counter value, @Param("assist") Assist assist);
    int updateNonEmptyCounterById(Counter enti);
    int updateNonEmptyCounter(@Param("enti") Counter value, @Param("assist") Assist assist);
}