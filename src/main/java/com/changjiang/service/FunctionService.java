package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Function;
import com.changjiang.common.Assist;
public interface FunctionService{
	
    long getFunctionRowCount(Assist assist);    
    Function selectFunctionById(Integer id);
    
    int insertNonEmptyFunction(Function value);
    int deleteFunctionById(Integer id);
    int deleteFunction(Assist assist);
    
    int updateFunction(Function value, Assist assist);
    int updateNonEmptyFunctionById(Function enti);
    int updateNonEmptyFunction(Function value, Assist assist);
    
    
    //查询所有数据
    List<Function> selectFunction();
    //查询当前id的子节点(ztree实现)
    List<Function> selectSonFunction(String id);
    //增加function  需要阐明增加的”upper_level_id” 
    int insertFunction(Function value);
    //修改function名称
    int updateFunctionById(Function enti);
    //删除节点，同时删除所有子节点
    int deleteFunctionTree(Function enti);
}