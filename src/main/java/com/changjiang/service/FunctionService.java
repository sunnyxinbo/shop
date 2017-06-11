package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Function;
public interface FunctionService{
    long getFunctionRowCount();
    List<Function> selectFunction();
    Function selectFunctionById(Integer id);
    int insertFunction(Function value);
    int insertNonEmptyFunction(Function value);
    int deleteFunctionById(Integer id);
    int updateFunctionById(Function enti);
    int updateNonEmptyFunctionById(Function enti);
}