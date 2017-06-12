package com.changjiang.service;
import java.util.List;
import com.changjiang.entity.UserInformation;
import com.changjiang.common.Assist;
public interface UserInformationService{
    long getUserInformationRowCount(Assist assist);
    List<UserInformation> selectUserInformation(Assist assist);
    UserInformation selectUserInformationById(Integer id);
    int insertUserInformation(UserInformation value);
    int insertNonEmptyUserInformation(UserInformation value);
    int deleteUserInformationById(Integer id);
    int deleteUserInformation(Assist assist);
    int updateUserInformationById(UserInformation enti);
    int updateUserInformation(UserInformation value, Assist assist);
    int updateNonEmptyUserInformationById(UserInformation enti);
    int updateNonEmptyUserInformation(UserInformation value, Assist assist);
}