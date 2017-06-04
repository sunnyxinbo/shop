package com.changjiang.service;
import com.changjiang.entity.OfficialTrade;
import com.changjiang.dao.OfficialTradeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OfficialTradeServiceImpl implements OfficialTradeService{
    @Autowired
    private OfficialTradeDao officialTradeDao;
    @Override
    public long getOfficialTradeRowCount(){
        return officialTradeDao.getOfficialTradeRowCount();
    }
    @Override
    public List<OfficialTrade> selectOfficialTrade(){
        return officialTradeDao.selectOfficialTrade();
    }
    @Override
    public OfficialTrade selectOfficialTradeById(Integer id){
        return officialTradeDao.selectOfficialTradeById(id);
    }
    @Override
    public int insertOfficialTrade(OfficialTrade value){
        return officialTradeDao.insertOfficialTrade(value);
    }
    @Override
    public int insertNonEmptyOfficialTrade(OfficialTrade value){
        return officialTradeDao.insertNonEmptyOfficialTrade(value);
    }
    @Override
    public int deleteOfficialTradeById(Integer id){
        return officialTradeDao.deleteOfficialTradeById(id);
    }
    @Override
    public int updateOfficialTradeById(OfficialTrade enti){
        return officialTradeDao.updateOfficialTradeById(enti);
    }
    @Override
    public int updateNonEmptyOfficialTradeById(OfficialTrade enti){
        return officialTradeDao.updateNonEmptyOfficialTradeById(enti);
    }

    public OfficialTradeDao getOfficialTradeDao() {
        return this.officialTradeDao;
    }

    public void setOfficialTradeDao(OfficialTradeDao officialTradeDao) {
        this.officialTradeDao = officialTradeDao;
    }

}