package com.changjiang.service;
import java.util.List;
import com.changjiang.dao.FunctionDao;
import com.changjiang.entity.Function;
import com.changjiang.common.Assist;
public class FunctionServiceImpl implements FunctionService{
    private FunctionDao functionDao;
    @Override
    public long getFunctionRowCount(Assist assist){
        return functionDao.getFunctionRowCount(assist);
    }
    @Override
    public List<Function> selectFunction(Assist assist){
        return functionDao.selectFunction(assist);
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
    public int deleteFunction(Assist assist){
        return functionDao.deleteFunction(assist);
    }
    @Override
    public int updateFunctionById(Function enti){
        return functionDao.updateFunctionById(enti);
    }
    @Override
    public int updateFunction(Function value, Assist assist){
        return functionDao.updateFunction(value,assist);
    }
    @Override
    public int updateNonEmptyFunctionById(Function enti){
        return functionDao.updateNonEmptyFunctionById(enti);
    }
    @Override
    public int updateNonEmptyFunction(Function value, Assist assist){
        return functionDao.updateNonEmptyFunction(value,assist);
    }

    public FunctionDao getFunctionDao() {
        return this.functionDao;
    }

    public void setFunctionDao(FunctionDao functionDao) {
        this.functionDao = functionDao;
    }

}