package com.changjiang.dao;
import com.changjiang.entity.RolePower;
import java.util.List;
public interface RolePowerDao{
    long getRolePowerRowCount();
    List<RolePower> selectRolePower();
    RolePower selectRolePowerById(Integer id);
    int insertRolePower(RolePower value);
    int insertNonEmptyRolePower(RolePower value);
    int deleteRolePowerById(Integer id);
    int updateRolePowerById(RolePower enti);
    int updateNonEmptyRolePowerById(RolePower enti);
}