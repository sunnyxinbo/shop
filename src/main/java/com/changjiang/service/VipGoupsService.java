package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.VipGoups;
import com.changjiang.common.Assist;
public interface VipGoupsService{
    long getVipGoupsRowCount(Assist assist);
    List<VipGoups> selectVipGoups(Assist assist);
    VipGoups selectVipGoupsById(Integer id);
    int insertVipGoups(VipGoups value);
    int insertNonEmptyVipGoups(VipGoups value);
    int deleteVipGoupsById(Integer id);
    int deleteVipGoups(Assist assist);
    int updateVipGoupsById(VipGoups enti);
    int updateVipGoups(VipGoups value, Assist assist);
    int updateNonEmptyVipGoupsById(VipGoups enti);
    int updateNonEmptyVipGoups(VipGoups value, Assist assist);
}