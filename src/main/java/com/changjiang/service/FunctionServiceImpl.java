package com.changjiang.service;

import java.util.ArrayList;
import java.util.List;
import com.changjiang.dao.FunctionDao;
import com.changjiang.entity.Function;
import com.changjiang.common.Assist;

public class FunctionServiceImpl implements FunctionService {
	private FunctionDao functionDao;

	@Override
	public long getFunctionRowCount(Assist assist) {
		return functionDao.getFunctionRowCount(assist);
	}

	@Override
	public Function selectFunctionById(Integer id) {
		return functionDao.selectFunctionById(id);
	}

	@Override
	public int insertNonEmptyFunction(Function value) {
		return functionDao.insertNonEmptyFunction(value);
	}

	@Override
	public int deleteFunctionById(Integer id) {
		return functionDao.deleteFunctionById(id);
	}

	@Override
	public int deleteFunction(Assist assist) {
		return functionDao.deleteFunction(assist);
	}
	@Override
	public int updateFunction(Function value, Assist assist) {
		
		return functionDao.updateFunction(value, assist);
	}

	@Override
	public int updateNonEmptyFunctionById(Function enti) {
		return functionDao.updateNonEmptyFunctionById(enti);
	}

	@Override
	public int updateNonEmptyFunction(Function value, Assist assist) {
		return functionDao.updateNonEmptyFunction(value, assist);
	}

	public FunctionDao getFunctionDao() {
		return this.functionDao;
	}

	public void setFunctionDao(FunctionDao functionDao) {
		this.functionDao = functionDao;
	}

	// 查询所有数据
	@Override
	public List<Function> selectFunction() {
		Assist assist = new Assist();
		return functionDao.selectFunction(assist);
	}

	// 修改function名称
	@Override
	public int updateFunctionById(Function enti) {
		return functionDao.updateFunctionById(enti);
	}

	// 删除节点，同时删除所有子节点
	@Override
	public int deleteFunctionTree(Function enti) {
		//定义删除的根节点
		String id = ""+enti.getId();
		List<Function> sonList = selectSonFunction(id);
		Assist assist = new Assist();
		Assist assist1 = new Assist();
		//查询所有子节点
		
		List allSonList = new ArrayList();
		
		//删除所有当前节点的所有子节点
		for(int i=0;i<sonList.size();i++){
			
			functionDao.deleteFunctionById(sonList.get(i).getId());
			
		}

		
		functionDao.deleteFunction(assist);
		return 0;
	}
	

	// 增加function 
	@Override
	public int insertFunction(Function value) {
		return functionDao.insertFunction(value);
	}

	// 查询当前id的子节点(ztree实现)
	@Override
	public List<Function> selectSonFunction(String id) {

		Assist assist = new Assist();
		assist.setResultColumn("id,function_name,upper_level_id");//查询的字段包括id,name,upper_level_id
		assist.setRequires(assist.and_eq("upper_level_id", id));//查询当前id子节点

		List<Function> sonFunction = functionDao.selectFunction(assist);
		
		return sonFunction;
	}

	

}