package com.changjiang.dao;
import com.changjiang.entity.Users;
import java.util.List;
public interface UsersDao{
    long getUsersRowCount();
    List<Users> selectUsers();
    Users selectUsersById(Integer id);
    int insertUsers(Users value);
    int insertNonEmptyUsers(Users value);
    int deleteUsersById(Integer id);
    int updateUsersById(Users enti);
    int updateNonEmptyUsersById(Users enti);
}