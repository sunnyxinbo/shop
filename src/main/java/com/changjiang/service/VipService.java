package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Vip;
import com.changjiang.common.Assist;
public interface VipService{
    long getVipRowCount(Assist assist);
    List<Vip> selectVip(Assist assist);
    Vip selectVipById(Integer id);
    int insertVip(Vip value);
    int insertNonEmptyVip(Vip value);
    int deleteVipById(Integer id);
    int deleteVip(Assist assist);
    int updateVipById(Vip enti);
    int updateVip(Vip value, Assist assist);
    int updateNonEmptyVipById(Vip enti);
    int updateNonEmptyVip(Vip value, Assist assist);
}