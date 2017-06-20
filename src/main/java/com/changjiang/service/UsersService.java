package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Users;
import com.changjiang.common.Assist;
public interface UsersService{
    long getUsersRowCount(Assist assist);
    List<Users> selectUsers(Assist assist);
    Users selectUsersById(Integer id);
    int insertUsers(Users value);
    int insertNonEmptyUsers(Users value);
    int deleteUsersById(Integer id);
    int deleteUsers(Assist assist);
    int updateUsersById(Users enti);
    int updateUsers(Users value, Assist assist);
    int updateNonEmptyUsersById(Users enti);
    int updateNonEmptyUsers(Users value, Assist assist);
    Users selectUsersHaveAll(Integer id);
    Users login(String username,String password);
}