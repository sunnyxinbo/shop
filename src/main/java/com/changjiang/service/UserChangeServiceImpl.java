package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.UserChangeDao;
import com.changjiang.entity.UserChange;
@Service
public class UserChangeServiceImpl implements UserChangeService{
	@Autowired
    private UserChangeDao userChangeDao;
    @Override
    public long getUserChangeRowCount(){
        return userChangeDao.getUserChangeRowCount();
    }
    @Override
    public List<UserChange> selectUserChange(){
        return userChangeDao.selectUserChange();
    }
    @Override
    public UserChange selectUserChangeById(Integer id){
        return userChangeDao.selectUserChangeById(id);
    }
    @Override
    public int insertUserChange(UserChange value){
        return userChangeDao.insertUserChange(value);
    }
    @Override
    public int insertNonEmptyUserChange(UserChange value){
        return userChangeDao.insertNonEmptyUserChange(value);
    }
    @Override
    public int deleteUserChangeById(Integer id){
        return userChangeDao.deleteUserChangeById(id);
    }
    @Override
    public int updateUserChangeById(UserChange enti){
        return userChangeDao.updateUserChangeById(enti);
    }
    @Override
    public int updateNonEmptyUserChangeById(UserChange enti){
        return userChangeDao.updateNonEmptyUserChangeById(enti);
    }

    public UserChangeDao getUserChangeDao() {
        return this.userChangeDao;
    }

    public void setUserChangeDao(UserChangeDao userChangeDao) {
        this.userChangeDao = userChangeDao;
    }

}