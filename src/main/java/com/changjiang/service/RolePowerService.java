package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.RolePower;
public interface RolePowerService{
    long getRolePowerRowCount();
    List<RolePower> selectRolePower();
    RolePower selectRolePowerById(Integer id);
    int insertRolePower(RolePower value);
    int insertNonEmptyRolePower(RolePower value);
    int deleteRolePowerById(Integer id);
    int updateRolePowerById(RolePower enti);
    int updateNonEmptyRolePowerById(RolePower enti);
}