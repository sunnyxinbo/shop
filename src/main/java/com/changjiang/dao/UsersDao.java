package com.changjiang.dao;
import com.changjiang.entity.Users;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface UsersDao{
    long getUsersRowCount(Assist assist);
    List<Users> selectUsers(Assist assist);
    Users selectUsersById(Integer id);
    int insertUsers(Users value);
    int insertNonEmptyUsers(Users value);
    int deleteUsersById(Integer id);
    int deleteUsers(Assist assist);
    int updateUsersById(Users enti);
    int updateUsers(@Param("enti") Users value, @Param("assist") Assist assist);
    int updateNonEmptyUsersById(Users enti);
    int updateNonEmptyUsers(@Param("enti") Users value, @Param("assist") Assist assist);
}