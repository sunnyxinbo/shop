package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.Users;
public interface UsersService{
    long getUsersRowCount();
    List<Users> selectUsers();
    Users selectUsersById(Integer id);
    int insertUsers(Users value);
    int insertNonEmptyUsers(Users value);
    int deleteUsersById(Integer id);
    int updateUsersById(Users enti);
    int updateNonEmptyUsersById(Users enti);
}