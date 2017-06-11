package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.UserChange;
public interface UserChangeService{
    long getUserChangeRowCount();
    List<UserChange> selectUserChange();
    UserChange selectUserChangeById(Integer id);
    int insertUserChange(UserChange value);
    int insertNonEmptyUserChange(UserChange value);
    int deleteUserChangeById(Integer id);
    int updateUserChangeById(UserChange enti);
    int updateNonEmptyUserChangeById(UserChange enti);
}