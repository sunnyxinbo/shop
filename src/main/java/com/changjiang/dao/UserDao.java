package com.changjiang.dao;
import com.changjiang.entity.User;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface UserDao{
    long getUserRowCount(Assist assist);
    List<User> selectUser(Assist assist);
    User selectUserById(Integer id);
    int insertUser(User value);
    int insertNonEmptyUser(User value);
    int deleteUserById(Integer id);
    int deleteUser(Assist assist);
    int updateUserById(User enti);
    int updateUser(@Param("enti") User value, @Param("assist") Assist assist);
    int updateNonEmptyUserById(User enti);
    int updateNonEmptyUser(@Param("enti") User value, @Param("assist") Assist assist);
}