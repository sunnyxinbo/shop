package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.FunctionDao;
import com.changjiang.entity.Function;
@Service
public class FunctionServiceImpl implements FunctionService{
	@Autowired
    private FunctionDao functionDao;
    @Override
    public long getFunctionRowCount(){
        return functionDao.getFunctionRowCount();
    }
    @Override
    public List<Function> selectFunction(){
        return functionDao.selectFunction();
    }
    @Override
    public Function selectFunctionById(Integer id){
        return functionDao.selectFunctionById(id);
    }
    @Override
    public int insertFunction(Function value){
        return functionDao.insertFunction(value);
    }
    @Override
    public int insertNonEmptyFunction(Function value){
        return functionDao.insertNonEmptyFunction(value);
    }
    @Override
    public int deleteFunctionById(Integer id){
        return functionDao.deleteFunctionById(id);
    }
    @Override
    public int updateFunctionById(Function enti){
        return functionDao.updateFunctionById(enti);
    }
    @Override
    public int updateNonEmptyFunctionById(Function enti){
        return functionDao.updateNonEmptyFunctionById(enti);
    }

    public FunctionDao getFunctionDao() {
        return this.functionDao;
    }

    public void setFunctionDao(FunctionDao functionDao) {
        this.functionDao = functionDao;
    }

}