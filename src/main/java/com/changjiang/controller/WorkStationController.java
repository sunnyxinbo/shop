package com.changjiang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.changjiang.entity.WorkStation;
import com.changjiang.service.WorkStationService;

@RestController
public class WorkStationController {
	@Autowired
	private WorkStationService service;
	@RequestMapping(value="workStations",produces="application/json,charst=UTF-8",method=
		RequestMethod.POST)
	public List<WorkStation> getWorkStationsBySoreId(@RequestParam("storeId") Integer id){
		List<WorkStation> workStations=service.selectWorkStationByStoreId(id);
		return workStations;
	}

}
