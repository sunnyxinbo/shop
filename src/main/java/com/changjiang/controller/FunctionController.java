package com.changjiang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.changjiang.model.FunctionNestNode;
import com.changjiang.model.FunctionNode;
import com.changjiang.service.FunctionService;

@RestController
public class FunctionController {
	@Autowired
	private FunctionService service;
	@RequestMapping(value="/functions",produces="application/json;charset=UTF-8",
			method=RequestMethod.POST)
	public List<FunctionNestNode> functions(@RequestParam("userId") Integer userId){
		List<FunctionNestNode> result=new ArrayList<>();
		result=service.getFunctionByUserId(userId);
		return result;
	}
	//查找没有嵌套的所有功能
	@RequestMapping(value="/noNestFunctions",produces="application/json;charset=UTF-8",
			method=RequestMethod.POST)
	public List<FunctionNode> noNestfunctions(){
		List<FunctionNode> result=new ArrayList<>();
		result=service.getAllFunctionNoNest();
		return result;
	}
	@RequestMapping(value="/deleteSingleFunction",produces="text/plain;charset=UTF-8",
			method=RequestMethod.POST)
	public String deleteSingleFunction(@RequestParam("function_id") Integer id){
		int sign=service.deleteFunctionById(id);
		if(sign==1){
			return "success";
		}else{
			return "defeat";
		}
	}
	@RequestMapping(value="/changeFunctionName",produces="text/plain;charset=UTF-8",
			method=RequestMethod.POST)
	public String renameFunction(@RequestParam("function_id") Integer id,@RequestParam("newName") String newName){
		int sign=service.updateNonEmptyFunctionById(id, newName);
		if(sign==1){
			return "success";
		}else{
			return "defeat";
		}
	}
}
