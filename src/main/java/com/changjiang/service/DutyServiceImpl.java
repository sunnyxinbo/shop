package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.DutyDao;
import com.changjiang.entity.Duty;
@Service
public class DutyServiceImpl implements DutyService{
	@Autowired
    private DutyDao dutyDao;
    @Override
    public long getDutyRowCount(){
        return dutyDao.getDutyRowCount();
    }
    @Override
    public List<Duty> selectDuty(){
        return dutyDao.selectDuty();
    }
    @Override
    public Duty selectDutyById(Integer id){
        return dutyDao.selectDutyById(id);
    }
    @Override
    public int insertDuty(Duty value){
        return dutyDao.insertDuty(value);
    }
    @Override
    public int insertNonEmptyDuty(Duty value){
        return dutyDao.insertNonEmptyDuty(value);
    }
    @Override
    public int deleteDutyById(Integer id){
        return dutyDao.deleteDutyById(id);
    }
    @Override
    public int updateDutyById(Duty enti){
        return dutyDao.updateDutyById(enti);
    }
    @Override
    public int updateNonEmptyDutyById(Duty enti){
        return dutyDao.updateNonEmptyDutyById(enti);
    }

    public DutyDao getDutyDao() {
        return this.dutyDao;
    }

    public void setDutyDao(DutyDao dutyDao) {
        this.dutyDao = dutyDao;
    }

}