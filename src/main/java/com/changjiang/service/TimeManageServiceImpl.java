package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.TimeManageDao;
import com.changjiang.entity.TimeManage;
@Service
public class TimeManageServiceImpl implements TimeManageService{
	@Autowired
    private TimeManageDao timeManageDao;
    @Override
    public long getTimeManageRowCount(){
        return timeManageDao.getTimeManageRowCount();
    }
    @Override
    public List<TimeManage> selectTimeManage(){
        return timeManageDao.selectTimeManage();
    }
    @Override
    public TimeManage selectTimeManageById(Integer id){
        return timeManageDao.selectTimeManageById(id);
    }
    @Override
    public int insertTimeManage(TimeManage value){
        return timeManageDao.insertTimeManage(value);
    }
    @Override
    public int insertNonEmptyTimeManage(TimeManage value){
        return timeManageDao.insertNonEmptyTimeManage(value);
    }
    @Override
    public int deleteTimeManageById(Integer id){
        return timeManageDao.deleteTimeManageById(id);
    }
    @Override
    public int updateTimeManageById(TimeManage enti){
        return timeManageDao.updateTimeManageById(enti);
    }
    @Override
    public int updateNonEmptyTimeManageById(TimeManage enti){
        return timeManageDao.updateNonEmptyTimeManageById(enti);
    }

    public TimeManageDao getTimeManageDao() {
        return this.timeManageDao;
    }

    public void setTimeManageDao(TimeManageDao timeManageDao) {
        this.timeManageDao = timeManageDao;
    }

}