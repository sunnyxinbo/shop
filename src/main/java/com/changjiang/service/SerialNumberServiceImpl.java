package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.SerialNumberDao;
import com.changjiang.entity.SerialNumber;
import com.changjiang.common.Assist;
@Service
public class SerialNumberServiceImpl implements SerialNumberService{
    @Autowired
	private SerialNumberDao serialNumberDao;
    @Override
    public long getSerialNumberRowCount(Assist assist){
        return serialNumberDao.getSerialNumberRowCount(assist);
    }
    @Override
    public List<SerialNumber> selectSerialNumber(Assist assist){
        return serialNumberDao.selectSerialNumber(assist);
    }
    @Override
    public SerialNumber selectSerialNumberById(Integer id){
        return serialNumberDao.selectSerialNumberById(id);
    }
    @Override
    public int insertSerialNumber(SerialNumber value){
        return serialNumberDao.insertSerialNumber(value);
    }
    @Override
    public int insertNonEmptySerialNumber(SerialNumber value){
        return serialNumberDao.insertNonEmptySerialNumber(value);
    }
    @Override
    public int deleteSerialNumberById(Integer id){
        return serialNumberDao.deleteSerialNumberById(id);
    }
    @Override
    public int deleteSerialNumber(Assist assist){
        return serialNumberDao.deleteSerialNumber(assist);
    }
    @Override
    public int updateSerialNumberById(SerialNumber enti){
        return serialNumberDao.updateSerialNumberById(enti);
    }
    @Override
    public int updateSerialNumber(SerialNumber value, Assist assist){
        return serialNumberDao.updateSerialNumber(value,assist);
    }
    @Override
    public int updateNonEmptySerialNumberById(SerialNumber enti){
        return serialNumberDao.updateNonEmptySerialNumberById(enti);
    }
    @Override
    public int updateNonEmptySerialNumber(SerialNumber value, Assist assist){
        return serialNumberDao.updateNonEmptySerialNumber(value,assist);
    }

    public SerialNumberDao getSerialNumberDao() {
        return this.serialNumberDao;
    }

    public void setSerialNumberDao(SerialNumberDao serialNumberDao) {
        this.serialNumberDao = serialNumberDao;
    }

}