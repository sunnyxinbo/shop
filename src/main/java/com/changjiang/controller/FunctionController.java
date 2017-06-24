package com.changjiang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.changjiang.model.Node;
import com.changjiang.service.FunctionService;

@RestController
public class FunctionController {
	@Autowired
	private FunctionService service;
	@RequestMapping(value="/functions",produces="application/json;charset=UTF-8",
			method=RequestMethod.POST)
	public List<Node> functions(@RequestParam("userId") Integer userId){
		List<Node> result=new ArrayList<>();
		result=service.getFunctionByUserId(userId);
		return result;
	}
}
