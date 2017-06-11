package com.changjiang.dao;
import com.changjiang.entity.Function;
import java.util.List;
public interface FunctionDao{
    long getFunctionRowCount();
    List<Function> selectFunction();
    Function selectFunctionById(Integer id);
    int insertFunction(Function value);
    int insertNonEmptyFunction(Function value);
    int deleteFunctionById(Integer id);
    int updateFunctionById(Function enti);
    int updateNonEmptyFunctionById(Function enti);
}