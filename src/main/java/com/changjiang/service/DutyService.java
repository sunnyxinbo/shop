package com.changjiang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.changjiang.entity.Duty;
import com.changjiang.mapper.DutyMapper;

@Service
public class DutyService {
	@Autowired
	private DutyMapper mapper;
	public Duty getDuty(int id){
		Duty duty=new Duty();
		duty=mapper.testSelect(id);
		return duty;
	}
}
