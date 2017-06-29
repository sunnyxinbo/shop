package com.changjiang.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.FunctionDao;
import com.changjiang.dao.RolePowerDao;
import com.changjiang.dao.UsersDao;
import com.changjiang.entity.Function;
import com.changjiang.entity.RolePower;
import com.changjiang.entity.Users;
import com.changjiang.model.Node;

import com.changjiang.common.Assist;
@Service()
public class FunctionServiceImpl implements FunctionService{
    @Autowired
	private FunctionDao functionDao;
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private RolePowerDao rolePowerDao;
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
    //这个获得排序后节点的方法基于表中数据是有序的形式
	@Override
	public List<Node> getFunctionByUserId(Integer id) {
		List<RolePower> rolePowers=new ArrayList<>();
		Users user=usersDao.selectUsersById(id);
		rolePowers=rolePowerDao.selectRolePowerByRoleId(user.getRoleId());
		List<Function> functionsOnFirst=new ArrayList<>();
		List<Function> functionsOnSecond=new ArrayList<>();
		//所有子节点的父节点的Functionid
		Set<Integer> parents=new HashSet<>();
		for(RolePower rolePower:rolePowers){
			//将功能分为一级和二级
			if(rolePower.getFunction().getCurrentLevel().equals(1)){
				//根据索引对其进行排序
				functionsOnFirst.add(rolePower.getFunction());
			}else{
				functionsOnSecond.add(rolePower.getFunction());
				parents.add(rolePower.getFunction().getUpperLevelId());
			}
		}
		Collections.sort(functionsOnFirst,new Comparator<Function>(){
			@Override
			public int compare(Function o1, Function o2) {
				//根据order进行排序
				return o1.getOrderId()-o2.getOrderId();
			}
		});
		Collections.sort(functionsOnSecond,new Comparator<Function>(){
			@Override
			public int compare(Function o1, Function o2) {
				// TODO Auto-generated method stub
				return o1.getOrderId()-o2.getOrderId();
			}
		});
		List<Node> nodes=new ArrayList<>(functionsOnFirst.size());
		for(Function function:functionsOnFirst){
			Node node=new Node();
			//说明有子节点
			if(parents.contains(function.getId())){
				//查出这个节点的所有子节点
				List<Function> functions=new ArrayList<>();
				for(Function f:functionsOnSecond){
					if(f.getUpperLevelId().equals(function.getId())){
						functions.add(f);
					}
				}
				functionsOnSecond.removeAll(functions);
				Collections.sort(functions,new Comparator<Function>(){
					@Override
					public int compare(Function o1, Function o2) {
						// TODO Auto-generated method stub
						return o1.getOrderId()-o2.getOrderId();
					}
				});
				//得到这个节点的所有子节点
				List<Node> childNodes=new ArrayList<>(functions.size());
				for(int i=0;i<functions.size();i++){
					Node childNode=new Node();
					childNode.setId(functions.get(i).getId());
					childNode.setIcon(functions.get(i).getIcon());
					childNode.setName(functions.get(i).getFunctionName());
					childNode.setChild(0);
					childNode.setUrls(functions.get(i).getUrls());
					childNodes.add(childNode);
				}
				//得到这个节点的子节点属性
				node.setNodes(childNodes);
				node.setChild(1);
				node.setIcon(function.getIcon());
				node.setName(function.getFunctionName());
				node.setId(function.getId());
				node.setUrls(function.getUrls());
				nodes.add(node);
			}else{
				node.setChild(0);
				node.setIcon(function.getIcon());
				node.setName(function.getFunctionName());
				node.setId(function.getId());
				node.setUrls(function.getUrls());
				nodes.add(node);
			}
		}
		return nodes;
	}

}