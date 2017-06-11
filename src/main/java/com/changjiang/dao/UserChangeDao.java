package com.changjiang.dao;
import com.changjiang.entity.UserChange;
import java.util.List;
public interface UserChangeDao{
    long getUserChangeRowCount();
    List<UserChange> selectUserChange();
    UserChange selectUserChangeById(Integer id);
    int insertUserChange(UserChange value);
    int insertNonEmptyUserChange(UserChange value);
    int deleteUserChangeById(Integer id);
    int updateUserChangeById(UserChange enti);
    int updateNonEmptyUserChangeById(UserChange enti);
}