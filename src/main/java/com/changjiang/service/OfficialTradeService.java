package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.OfficialTrade;
public interface OfficialTradeService{
    long getOfficialTradeRowCount();
    List<OfficialTrade> selectOfficialTrade();
    OfficialTrade selectOfficialTradeById(Integer id);
    int insertOfficialTrade(OfficialTrade value);
    int insertNonEmptyOfficialTrade(OfficialTrade value);
    int deleteOfficialTradeById(Integer id);
    int updateOfficialTradeById(OfficialTrade enti);
    int updateNonEmptyOfficialTradeById(OfficialTrade enti);
}