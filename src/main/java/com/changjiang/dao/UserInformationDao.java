package com.changjiang.dao;
import com.changjiang.entity.UserInformation;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
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
    @Select("SELECT id from user_information WHERE id_number=#{IdNumber}")
    @Results({
    	@Result(id=true,column="id",property="id")
    })
    Integer selectUserInformationIdByIdNumber(String IdNumber);
    /**
	 * 通过id查询userInformation与其对应的workstation
	 * @param id
	 * @return
	 */
    List<UserInformation> findUserInformationAndWorkStation(Integer id);
}