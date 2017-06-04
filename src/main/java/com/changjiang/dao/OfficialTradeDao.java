package com.changjiang.dao;
import com.changjiang.entity.OfficialTrade;
import java.util.List;
public interface OfficialTradeDao{
    long getOfficialTradeRowCount();
    List<OfficialTrade> selectOfficialTrade();
    OfficialTrade selectOfficialTradeById(Integer id);
    int insertOfficialTrade(OfficialTrade value);
    int insertNonEmptyOfficialTrade(OfficialTrade value);
    int deleteOfficialTradeById(Integer id);
    int updateOfficialTradeById(OfficialTrade enti);
    int updateNonEmptyOfficialTradeById(OfficialTrade enti);
}