package com.changjiang.service;
import com.changjiang.entity.SerialNumber;
import com.changjiang.dao.SerialNumberDao;
import com.changjiang.service.SerialNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SerialNumberServiceImpl implements SerialNumberService{
	@Autowired
    private SerialNumberDao serialNumberDao;
    @Override
    public long getSerialNumberRowCount(){
        return serialNumberDao.getSerialNumberRowCount();
    }
    /**
     * 查询所有的流水号信息
     */
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

    /**
     * 通过id删除流水号
     * @param id
     * @return
     */
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