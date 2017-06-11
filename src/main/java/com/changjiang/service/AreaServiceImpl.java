package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.AreaDao;
import com.changjiang.entity.Area;
@Service
public class AreaServiceImpl implements AreaService{
	@Autowired
    private AreaDao areaDao;
    @Override
    public long getAreaRowCount(){
        return areaDao.getAreaRowCount();
    }
    @Override
    public List<Area> selectArea(){
        return areaDao.selectArea();
    }
    @Override
    public Area selectAreaById(Integer id){
        return areaDao.selectAreaById(id);
    }
    @Override
    public int insertArea(Area value){
        return areaDao.insertArea(value);
    }
    @Override
    public int insertNonEmptyArea(Area value){
        return areaDao.insertNonEmptyArea(value);
    }
    @Override
    public int deleteAreaById(Integer id){
        return areaDao.deleteAreaById(id);
    }
    @Override
    public int updateAreaById(Area enti){
        return areaDao.updateAreaById(enti);
    }
    @Override
    public int updateNonEmptyAreaById(Area enti){
        return areaDao.updateNonEmptyAreaById(enti);
    }

    public AreaDao getAreaDao() {
        return this.areaDao;
    }

    public void setAreaDao(AreaDao areaDao) {
        this.areaDao = areaDao;
    }

}