package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.UserInformationDao;
import com.changjiang.entity.UserInformation;
import com.changjiang.model.UserInformationModel;
import com.changjiang.common.Assist;
@Service
public class UserInformationServiceImpl implements UserInformationService{
    @Autowired
	private UserInformationDao userInformationDao;
    @Override
    public long getUserInformationRowCount(Assist assist){
        return userInformationDao.getUserInformationRowCount(assist);
    }
    @Override
    public List<UserInformation> selectUserInformation(Assist assist){
        return userInformationDao.selectUserInformation(assist);
    }
    @Override
    public UserInformation selectUserInformationById(Integer id){
        return userInformationDao.selectUserInformationById(id);
    }
    @Override
    public int insertUserInformation(UserInformation value){
        return userInformationDao.insertUserInformation(value);
    }
    @Override
    public int insertNonEmptyUserInformation(UserInformation value){
        return userInformationDao.insertNonEmptyUserInformation(value);
    }
    @Override
    public int deleteUserInformationById(Integer id){
        return userInformationDao.deleteUserInformationById(id);
    }
    @Override
    public int deleteUserInformation(Assist assist){
        return userInformationDao.deleteUserInformation(assist);
    }
    @Override
    public int updateUserInformationById(UserInformation enti){
        return userInformationDao.updateUserInformationById(enti);
    }
    @Override
    public int updateUserInformation(UserInformation value, Assist assist){
        return userInformationDao.updateUserInformation(value,assist);
    }
    @Override
    public int updateNonEmptyUserInformationById(UserInformation enti){
        return userInformationDao.updateNonEmptyUserInformationById(enti);
    }
    @Override
    public int updateNonEmptyUserInformation(UserInformation value, Assist assist){
        return userInformationDao.updateNonEmptyUserInformation(value,assist);
    }

    public UserInformationDao getUserInformationDao() {
        return this.userInformationDao;
    }

    public void setUserInformationDao(UserInformationDao userInformationDao) {
        this.userInformationDao = userInformationDao;
    }
    /**
	 * 查询用户信息和他的所有评价
	 */
	@Override
	public List<UserInformation> queryUserInformationAndEvaluations(Integer user_information_id) {
		List<UserInformation> userInformations = userInformationDao.queryUserInformationAndEvaluations(user_information_id);
		return userInformations;
	}
	@Override
	public Integer addUserInformation(UserInformationModel model) {
		UserInformation userInformation=new UserInformation();
		userInformation.setUserInformaton(model);
		userInformationDao.insertNonEmptyUserInformation(userInformation);
		Integer id=userInformationDao.selectUserInformationIdByIdNumber(model.getIdNumber());
		// TODO Auto-generated method stub
		return id;
	}

}