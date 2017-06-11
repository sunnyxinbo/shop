package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.SerialNumberDao;
import com.changjiang.entity.SerialNumber;
@Service
public class SerialNumberServiceImpl implements SerialNumberService{
	@Autowired
    private SerialNumberDao serialNumberDao;
    @Override
    public long getSerialNumberRowCount(){
        return serialNumberDao.getSerialNumberRowCount();
    }
    @Override
    public List<SerialNumber> selectSerialNumber(){
        return serialNumberDao.selectSerialNumber();
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
    public int updateSerialNumberById(SerialNumber enti){
        return serialNumberDao.updateSerialNumberById(enti);
    }
    @Override
    public int updateNonEmptySerialNumberById(SerialNumber enti){
        return serialNumberDao.updateNonEmptySerialNumberById(enti);
    }

    public SerialNumberDao getSerialNumberDao() {
        return this.serialNumberDao;
    }

    public void setSerialNumberDao(SerialNumberDao serialNumberDao) {
        this.serialNumberDao = serialNumberDao;
    }

}