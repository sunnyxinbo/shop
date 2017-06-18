package com.changjiang.dao;
import com.changjiang.entity.UserInformation;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface UserInformationDao{
    long getUserInformationRowCount(Assist assist);
    List<UserInformation> selectUserInformation(Assist assist);
    UserInformation selectUserInformationById(Integer id);
    int insertUserInformation(UserInformation value);
    int insertNonEmptyUserInformation(UserInformation value);
    int deleteUserInformationById(Integer id);
    int deleteUserInformation(Assist assist);
    int updateUserInformationById(UserInformation enti);
    int updateUserInformation(@Param("enti") UserInformation value, @Param("assist") Assist assist);
    int updateNonEmptyUserInformationById(UserInformation enti);
    int updateNonEmptyUserInformation(@Param("enti") UserInformation value, @Param("assist") Assist assist);
    /**
	 * 查询用户信息和他的所有评价
	 */
    List<UserInformation> queryUserInformationAndEvaluations(Integer user_information_id);
}