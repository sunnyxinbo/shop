package com.changjiang.dao;
import com.changjiang.entity.RolePower;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface RolePowerDao{
    long getRolePowerRowCount(Assist assist);
    List<RolePower> selectRolePower(Assist assist);
    RolePower selectRolePowerById(Integer id);
    int insertRolePower(RolePower value);
    int insertNonEmptyRolePower(RolePower value);
    int deleteRolePowerById(Integer id);
    int deleteRolePower(Assist assist);
    int updateRolePowerById(RolePower enti);
    int updateRolePower(@Param("enti") RolePower value, @Param("assist") Assist assist);
    int updateNonEmptyRolePowerById(RolePower enti);
    int updateNonEmptyRolePower(@Param("enti") RolePower value, @Param("assist") Assist assist);
}