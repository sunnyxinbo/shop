package com.changjiang.dao;
import com.changjiang.entity.VipGoups;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface VipGoupsDao{
    long getVipGoupsRowCount(Assist assist);
    List<VipGoups> selectVipGoups(Assist assist);
    VipGoups selectVipGoupsById(Integer id);
    int insertVipGoups(VipGoups value);
    int insertNonEmptyVipGoups(VipGoups value);
    int deleteVipGoupsById(Integer id);
    int deleteVipGoups(Assist assist);
    int updateVipGoupsById(VipGoups enti);
    int updateVipGoups(@Param("enti") VipGoups value, @Param("assist") Assist assist);
    int updateNonEmptyVipGoupsById(VipGoups enti);
    int updateNonEmptyVipGoups(@Param("enti") VipGoups value, @Param("assist") Assist assist);
}