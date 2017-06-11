package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.RolePowerDao;
import com.changjiang.entity.RolePower;
@Service
public class RolePowerServiceImpl implements RolePowerService{
	@Autowired
    private RolePowerDao rolePowerDao;
    @Override
    public long getRolePowerRowCount(){
        return rolePowerDao.getRolePowerRowCount();
    }
    @Override
    public List<RolePower> selectRolePower(){
        return rolePowerDao.selectRolePower();
    }
    @Override
    public RolePower selectRolePowerById(Integer id){
        return rolePowerDao.selectRolePowerById(id);
    }
    @Override
    public int insertRolePower(RolePower value){
        return rolePowerDao.insertRolePower(value);
    }
    @Override
    public int insertNonEmptyRolePower(RolePower value){
        return rolePowerDao.insertNonEmptyRolePower(value);
    }
    @Override
    public int deleteRolePowerById(Integer id){
        return rolePowerDao.deleteRolePowerById(id);
    }
    @Override
    public int updateRolePowerById(RolePower enti){
        return rolePowerDao.updateRolePowerById(enti);
    }
    @Override
    public int updateNonEmptyRolePowerById(RolePower enti){
        return rolePowerDao.updateNonEmptyRolePowerById(enti);
    }

    public RolePowerDao getRolePowerDao() {
        return this.rolePowerDao;
    }

    public void setRolePowerDao(RolePowerDao rolePowerDao) {
        this.rolePowerDao = rolePowerDao;
    }

}