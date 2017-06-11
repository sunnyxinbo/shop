package com.changjiang.dao;
import com.changjiang.entity.UserInformation;
import java.util.List;
public interface UserInformationDao{
    long getUserInformationRowCount();
    List<UserInformation> selectUserInformation();
    UserInformation selectUserInformationById(Integer id);
    int insertUserInformation(UserInformation value);
    int insertNonEmptyUserInformation(UserInformation value);
    int deleteUserInformationById(Integer id);
    int updateUserInformationById(UserInformation enti);
    int updateNonEmptyUserInformationById(UserInformation enti);
}