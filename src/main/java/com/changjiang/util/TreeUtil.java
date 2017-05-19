package com.changjiang.util;

import java.util.ArrayList;
import java.util.List;

import com.changjiang.entity.Function;

public class TreeUtil {
	//根据数据库中查出的数据转化为，节点集合的形式
	public static List<Node> getListFunction(List<Function> data){
		//初始化
		List<Node> result=new ArrayList<>();
		//存储被加载到节点集合中的数据
		ArrayList<Function> temps=new ArrayList<>();
		//第一次遍历，获取所有的顶级节点
		for(int i=0;i<data.size();i++){
			Function f=data.get(i);
			Integer upperLevelId=f.getUpperLevelId();
			//等于0为顶级节点
			if(upperLevelId==0){
				Node node=new Node();
				node.setId(f.getId());
				node.setName(f.getFunctionName());
				node.setCurrentLevel(f.getCurrentLevel());
				result.add(node);
			}
			temps.add(f);
		}
		//对之前被加载到节点集合的数据删除，防止重复遍历
		for(Function f:temps){
			data.remove(f);
		}
		//对
		return null;
	}
}
