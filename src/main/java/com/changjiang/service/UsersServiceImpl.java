package com.changjiang.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changjiang.dao.UsersDao;
import com.changjiang.entity.Users;
import com.changjiang.common.Assist;
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
	private UsersDao usersDao;
    @Override
    public long getUsersRowCount(Assist assist){
        return usersDao.getUsersRowCount(assist);
    }
    @Override
    public List<Users> selectUsers(Assist assist){
        return usersDao.selectUsers(assist);
    }
    @Override
    public Users selectUsersById(Integer id){
        return usersDao.selectUsersById(id);
    }
    @Override
    public int insertUsers(Users value){
        return usersDao.insertUsers(value);
    }
    @Override
    public int insertNonEmptyUsers(Users value){
        return usersDao.insertNonEmptyUsers(value);
    }
    @Override
    public int deleteUsersById(Integer id){
        return usersDao.deleteUsersById(id);
    }
    @Override
    public int deleteUsers(Assist assist){
        return usersDao.deleteUsers(assist);
    }
    @Override
    public int updateUsersById(Users enti){
        return usersDao.updateUsersById(enti);
    }
    @Override
    public int updateUsers(Users value, Assist assist){
        return usersDao.updateUsers(value,assist);
    }
    @Override
    public int updateNonEmptyUsersById(Users enti){
        return usersDao.updateNonEmptyUsersById(enti);
    }
    @Override
    public int updateNonEmptyUsers(Users value, Assist assist){
        return usersDao.updateNonEmptyUsers(value,assist);
    }

    public UsersDao getUsersDao() {
        return this.usersDao;
    }

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }
	@Override
	public Users selectUsersHaveAll(Integer id) {
		// TODO Auto-generated method stub
		return this.usersDao.selectSingleUserHaveAll(id);
	}
	//如果登录成功，返回这个成功登录的user对象
	@Override
	public Users login(String username, String password) {
		List<Users> users=usersDao.selectUsers(new Assist());
		for(Users u:users){
			if(username!=null&&password!=null&&u.getUsername().equals(username)&&
					u.getPassword().equals(password)){
				return u;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	//获得当前用户所在店铺的所有用户
	public List<Users> selectAllUsersByUserId(Integer id) {
		Users user=usersDao.selectUsersById(id);
		//根据user的id来查店铺编号
		List<Users> users=usersDao.selectAllUsersByUserId(user.getStore());
		// TODO Auto-generated method stub
		return users;
	}
	@Override
	//获得当前用户所在店铺的启用用户
	public List<Users> selectEnabledUsersByUserId(Integer id) {
		Users user=usersDao.selectUsersById(id);
		//根据user的id来查店铺编号
		List<Users> users=usersDao.selectEnabledUsersByUserId(user.getStore());
		// TODO Auto-generated method stub
		return users;
	}
	@Override
	//获得当前用户所在店铺的未启用用户
	public List<Users> selectDisabledUsersByUserId(Integer id) {
		Users user=usersDao.selectUsersById(id);
		//根据user的id来查店铺编号
		List<Users> users=usersDao.selectDisabledUsersByUserId(user.getStore());
		// TODO Auto-generated method stub
		return users;
	}
}