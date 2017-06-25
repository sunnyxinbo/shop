package com.changjiang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.changjiang.entity.Role;
import com.changjiang.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	private RoleService service;
	@RequestMapping(value="/getRoles",method=RequestMethod.POST,
			produces="application/json;charset=UTF-8")
	public List<Role> getRoleByStoreId(@RequestParam("id") String id){
		return service.selectRole(id);
	}
}
