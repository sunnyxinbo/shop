package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.WorkStationDao;
import com.changjiang.entity.WorkStation;
@Service
public class WorkStationServiceImpl implements WorkStationService{
	@Autowired
    private WorkStationDao workStationDao;
    @Override
    public long getWorkStationRowCount(){
        return workStationDao.getWorkStationRowCount();
    }
    @Override
    public List<WorkStation> selectWorkStation(){
        return workStationDao.selectWorkStation();
    }
    @Override
    public WorkStation selectWorkStationById(Integer id){
        return workStationDao.selectWorkStationById(id);
    }
    @Override
    public int insertWorkStation(WorkStation value){
        return workStationDao.insertWorkStation(value);
    }
    @Override
    public int insertNonEmptyWorkStation(WorkStation value){
        return workStationDao.insertNonEmptyWorkStation(value);
    }
    @Override
    public int deleteWorkStationById(Integer id){
        return workStationDao.deleteWorkStationById(id);
    }
    @Override
    public int updateWorkStationById(WorkStation enti){
        return workStationDao.updateWorkStationById(enti);
    }
    @Override
    public int updateNonEmptyWorkStationById(WorkStation enti){
        return workStationDao.updateNonEmptyWorkStationById(enti);
    }

    public WorkStationDao getWorkStationDao() {
        return this.workStationDao;
    }

    public void setWorkStationDao(WorkStationDao workStationDao) {
        this.workStationDao = workStationDao;
    }

}