package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.UserInformation;
public interface UserInformationService{
    long getUserInformationRowCount();
    List<UserInformation> selectUserInformation();
    UserInformation selectUserInformationById(Integer id);
    int insertUserInformation(UserInformation value);
    int insertNonEmptyUserInformation(UserInformation value);
    int deleteUserInformationById(Integer id);
    int updateUserInformationById(UserInformation enti);
    int updateNonEmptyUserInformationById(UserInformation enti);
}