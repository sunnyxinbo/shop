package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Function;
import com.changjiang.common.Assist;
public interface FunctionService{
    long getFunctionRowCount(Assist assist);
    List<Function> selectFunction(Assist assist);
    Function selectFunctionById(Integer id);
    int insertFunction(Function value);
    int insertNonEmptyFunction(Function value);
    int deleteFunctionById(Integer id);
    int deleteFunction(Assist assist);
    int updateFunctionById(Function enti);
    int updateFunction(Function value, Assist assist);
    int updateNonEmptyFunctionById(Function enti);
    int updateNonEmptyFunction(Function value, Assist assist);
}